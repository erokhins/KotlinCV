package org.hanuna.kotlincv

import org.hanuna.kotlincv.TwoDimensionObject
import org.hanuna.kotlincv.Coordinates

public trait Matrix<N> : TwoDimensionObject {
    public fun get(coord: Coordinates): N = get(coord.col, coord.row)

    public fun get(col: Int, row: Int): N
}

public trait MutableMatrix<N> : Matrix<N> {
    public fun set(coord: Coordinates, value: N): Unit = set(coord.col, coord.row, value)

    public fun set(col: Int, row: Int, value: N): Unit
}

public trait Vector<N> : OneDimensionObject {
    public fun get(index: Int): N
}

public trait MutableVector<N> : Vector<N> {
    public fun set(index: Int, value: N): Unit
}

public trait DoubleMatrix : Matrix<Double>
public trait FloatMatrix : Matrix<Float>
public trait LongMatrix : Matrix<Long>
public trait IntMatrix : Matrix<Int>
public trait ShortMatrix : Matrix<Short>
public trait ByteMatrix : Matrix<Byte>

public trait DoubleVector : Vector<Double>
public trait FloatVector : Vector<Float>
public trait LongVector : Vector<Long>
public trait IntVector : Vector<Int>
public trait ShortVector : Vector<Short>
public trait ByteVector : Vector<Byte>