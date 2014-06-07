package org.hanuna.kotlincv

import org.hanuna.kotlincv.equalSize
import org.hanuna.math.*
import org.hanuna.kotlincv
import org.hanuna.kotlincv.ImageMatrix

// Double, Float, Long, Int, Short, Byte

public fun <X, Y, R> coordinatewiseOperation(im1: Matrix<X>, im2: Matrix<Y>, operation: (X, Y) -> R): ImageMatrix<R>
        = object : ImageMatrix<R> {
    {
        assert(im1.equalSize(im2)) {
            "Size not equal: (${im1.rows}, ${im1.cols}) != (${im2.rows}, ${im2.cols})"
        }
    }
    override val cols: Int = im1.cols
    override val rows: Int = im1.rows
    override fun get_correct(col: Int, row: Int): R = operation(im1[col,row], im2[col, row])
}

public fun <X, R> coordinatewiseOperation(im: Matrix<X>, operation: (X) -> R): ImageMatrix<R>
        = object : ImageMatrix<R> {
    override val cols: Int = im.cols
    override val rows: Int = im.rows
    override fun get_correct(col: Int, row: Int): R = operation(im[col,row])
}


public fun <X, Y, R> coordinatewiseOperation(v1: Vector<X>, v2: Vector<Y>, operation: (X, Y) -> R): ImageVector<R>
        = object : ImageVector<R> {
    {
        assert(v1.equalSize(v2)) {
            "Size not equal: ${v1.size} != ${v2.size}"
        }
    }
    override val size: Int = v1.size
    override fun get_correct(index: Int): R = operation(v1[index], v2[index])
}

public fun <X, R> coordinatewiseOperation(v: Vector<X>, operation: (X) -> R): ImageVector<R>
        = object : ImageVector<R> {
    override val size: Int = v.size
    override fun get_correct(index: Int): R = operation(v[index])
}
