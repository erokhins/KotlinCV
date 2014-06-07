package org.hanuna.kotlincv

import org.hanuna.math.*
import org.hanuna.kotlincv.Coordinates
import org.hanuna.kotlincv.Matrix

/**
 * Created by smevok on 5/11/14.
 */


public trait ImageMatrix<N> : Matrix<N> {

    public fun toCorrectRow(row: Int): Int = row.toCorrectImageNumber(rows)
    public fun toCorrectCol(col: Int): Int = col.toCorrectImageNumber(cols)

    public override fun get(col: Int, row: Int): N = get_correct(toCorrectCol(col), toCorrectRow(row))

    // in this function (col in 0..cols-1) && row in (0..rows-1)
    protected fun get_correct(col: Int, row: Int): N
}

public trait MutableImageMatrix<N> : ImageMatrix<N>, MutableMatrix<N> {
    public override fun set(coord: Coordinates, value: N): Unit = set(coord.col, coord.row, value)

    public override fun set(col: Int, row: Int, value: N): Unit = set_correct(toCorrectCol(col), toCorrectRow(row), value)

    // in this function (col in 0..cols-1) && row in (0..rows-1)
    protected fun set_correct(col: Int, row: Int, value: N)
}

public trait ImageVector<N> : Vector<N> {
    override fun get(index: Int): N = get_correct(index.toCorrectImageNumber(size))

    protected fun get_correct(index: Int): N
}

public trait MutableImageVector<N> : ImageVector<N>, MutableVector<N> {
    override fun set(index: Int, value: N) = set_correct(index.toCorrectImageNumber(size), value)
    protected fun set_correct(index: Int, value: N)
}


public fun <N> Matrix<N>.toImageMatrix(): ImageMatrix<N>
        = object: ImageMatrix<N> {
    override val cols: Int = this@toImageMatrix.cols
    override val rows: Int = this@toImageMatrix.rows
    override fun get_correct(col: Int, row: Int): N = this@toImageMatrix[col, row]
}

public fun <N> MutableImageMatrix<N>.toMutableImageMatrix(): MutableImageMatrix<N>
        = object : MutableImageMatrix<N> {
    override fun set_correct(col: Int, row: Int, value: N) {
        this@toMutableImageMatrix[col, row] = value
    }
    override fun get_correct(col: Int, row: Int): N = this@toMutableImageMatrix[col, row]
    override val cols: Int = this@toMutableImageMatrix.cols
    override val rows: Int = this@toMutableImageMatrix.rows
}

public val <N> Matrix<N>.sample: N
    get() = this[0, 0]

public val <N> Vector<N>.sample: N
    get() = this[0]

public fun <N> Vector<N>.toImageVector(): ImageVector<N>
    = object : ImageVector<N> {
    override val size: Int = this@toImageVector.size
    override fun get_correct(index: Int): N = this@toImageVector[index]
}

public fun <N> MutableVector<N>.toMutableImageVector(): MutableImageVector<N>
        = object : MutableImageVector<N> {
    override val size: Int = this@toMutableImageVector.size
    override fun get_correct(index: Int): N = this@toMutableImageVector[index]
    override fun set_correct(index: Int, value: N) = this@toMutableImageVector.set(index, value)
}

public trait DoubleImageMatrix : ImageMatrix<Double>, DoubleMatrix
public trait FloatImageMatrix : ImageMatrix<Float>, FloatMatrix
public trait LongImageMatrix : ImageMatrix<Long>, LongMatrix
public trait IntImageMatrix : ImageMatrix<Int>, IntMatrix
public trait ShortImageMatrix : ImageMatrix<Short>, ShortMatrix
public trait ByteImageMatrix : ImageMatrix<Byte>, ByteMatrix

public trait DoubleImageVector : ImageVector<Double>, DoubleVector
public trait FloatImageVector : ImageVector<Float>, FloatVector
public trait LongImageVector : ImageVector<Long>, LongVector
public trait IntImageVector : ImageVector<Int>, IntVector
public trait ShortImageVector : ImageVector<Short>, ShortVector
public trait ByteImageVector : ImageVector<Byte>, ByteVector