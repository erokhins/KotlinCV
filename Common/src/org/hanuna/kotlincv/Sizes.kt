package org.hanuna.kotlincv

/**
 * Created by smevok on 5/11/14.
 */

public trait OneDimensionObject {
    public val size: Int
}

public fun OneDimensionObject.forAll(f: (Int) -> Unit) {
    for (index in 0..size-1)
        f(index)
}

public trait Coordinates {
    val col: Int
    val row: Int
}

public class SimpleCoordinates(override val col: Int, override val row: Int) : Coordinates

public trait TwoDimensionObject {
    public val cols: Int
    public val rows: Int
}

public fun TwoDimensionObject.forAll(colRange: IntRange = 0..cols-1, rowRange: IntRange = 0..rows-1, f: (Coordinates) -> Unit) {
    for (col in colRange)
        for (row in rowRange)
            f(SimpleCoordinates(col, row))
}

public fun OneDimensionObject.equalSize(other: OneDimensionObject): Boolean = this.size == other.size
public fun TwoDimensionObject.equalSize(other: TwoDimensionObject): Boolean = this.cols == other.cols && this.rows == other.rows