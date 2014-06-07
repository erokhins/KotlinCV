package org.hanuna.kotlincv

import org.hanuna.math.AbsorbentWithNumbers
import org.hanuna.math.to255Int

private fun <N : AbsorbentWithNumbers<N>> Matrix<N>.mi(other: DoubleMatrix): ImageMatrix<N>
        = coordinatewiseOperation(this, other) {
    (x, y) -> with(this.sample.withDouble) {x - y}
}
private fun <N : AbsorbentWithNumbers<N>> Matrix<N>.mi(other: FloatMatrix): ImageMatrix<N>
        = coordinatewiseOperation(this, other) {
    (x, y) -> with(this.sample.withFloat) {x - y}
}
private fun <N : AbsorbentWithNumbers<N>> Matrix<N>.mi(other: LongMatrix): ImageMatrix<N>
        = coordinatewiseOperation(this, other) {
    (x, y) -> with(this.sample.withLong) {x - y}
}
private fun <N : AbsorbentWithNumbers<N>> Matrix<N>.mi(other: IntMatrix): ImageMatrix<N>
        = coordinatewiseOperation(this, other) {
    (x, y) -> with(this.sample.withInt) {x - y}
}
private fun <N : AbsorbentWithNumbers<N>> Matrix<N>.mi(other: ShortMatrix): ImageMatrix<N>
        = coordinatewiseOperation(this, other) {
    (x, y) -> with(this.sample.withShort) {x - y}
}
private fun <N : AbsorbentWithNumbers<N>> Matrix<N>.mi(other: ByteMatrix): ImageMatrix<N>
        = coordinatewiseOperation(this, other) {
    (x, y) -> with(this.sample.withByte) {x - y}
}

public fun <N : AbsorbentWithNumbers<N>> Matrix<N>.minus(other: DoubleMatrix): Matrix<N> = this mi other
public fun <N : AbsorbentWithNumbers<N>> Matrix<N>.minus(other: DoubleImageMatrix): ImageMatrix<N> = this mi other
public fun <N : AbsorbentWithNumbers<N>> ImageMatrix<N>.minus(other: DoubleMatrix): ImageMatrix<N> = this mi other
public fun <N : AbsorbentWithNumbers<N>> DoubleMatrix.minus(other: Matrix<N>): Matrix<N> = other mi this
public fun <N : AbsorbentWithNumbers<N>> DoubleImageMatrix.minus(other: Matrix<N>): ImageMatrix<N> = other mi this
public fun <N : AbsorbentWithNumbers<N>> DoubleMatrix.minus(other: ImageMatrix<N>): ImageMatrix<N> = other mi this

public fun <N : AbsorbentWithNumbers<N>> Matrix<N>.minus(other: FloatMatrix): Matrix<N> = this mi other
public fun <N : AbsorbentWithNumbers<N>> Matrix<N>.minus(other: FloatImageMatrix): ImageMatrix<N> = this mi other
public fun <N : AbsorbentWithNumbers<N>> ImageMatrix<N>.minus(other: FloatMatrix): ImageMatrix<N> = this mi other
public fun <N : AbsorbentWithNumbers<N>> FloatMatrix.minus(other: Matrix<N>): Matrix<N> = other mi this
public fun <N : AbsorbentWithNumbers<N>> FloatImageMatrix.minus(other: Matrix<N>): ImageMatrix<N> = other mi this
public fun <N : AbsorbentWithNumbers<N>> FloatMatrix.minus(other: ImageMatrix<N>): ImageMatrix<N> = other mi this

public fun <N : AbsorbentWithNumbers<N>> Matrix<N>.minus(other: LongMatrix): Matrix<N> = this mi other
public fun <N : AbsorbentWithNumbers<N>> Matrix<N>.minus(other: LongImageMatrix): ImageMatrix<N> = this mi other
public fun <N : AbsorbentWithNumbers<N>> ImageMatrix<N>.minus(other: LongMatrix): ImageMatrix<N> = this mi other
public fun <N : AbsorbentWithNumbers<N>> LongMatrix.minus(other: Matrix<N>): Matrix<N> = other mi this
public fun <N : AbsorbentWithNumbers<N>> LongImageMatrix.minus(other: Matrix<N>): ImageMatrix<N> = other mi this
public fun <N : AbsorbentWithNumbers<N>> LongMatrix.minus(other: ImageMatrix<N>): ImageMatrix<N> = other mi this

public fun <N : AbsorbentWithNumbers<N>> Matrix<N>.minus(other: IntMatrix): Matrix<N> = this mi other
public fun <N : AbsorbentWithNumbers<N>> Matrix<N>.minus(other: IntImageMatrix): ImageMatrix<N> = this mi other
public fun <N : AbsorbentWithNumbers<N>> ImageMatrix<N>.minus(other: IntMatrix): ImageMatrix<N> = this mi other
public fun <N : AbsorbentWithNumbers<N>> IntMatrix.minus(other: Matrix<N>): Matrix<N> = other mi this
public fun <N : AbsorbentWithNumbers<N>> IntImageMatrix.minus(other: Matrix<N>): ImageMatrix<N> = other mi this
public fun <N : AbsorbentWithNumbers<N>> IntMatrix.minus(other: ImageMatrix<N>): ImageMatrix<N> = other mi this

public fun <N : AbsorbentWithNumbers<N>> Matrix<N>.minus(other: ShortMatrix): Matrix<N> = this mi other
public fun <N : AbsorbentWithNumbers<N>> Matrix<N>.minus(other: ShortImageMatrix): ImageMatrix<N> = this mi other
public fun <N : AbsorbentWithNumbers<N>> ImageMatrix<N>.minus(other: ShortMatrix): ImageMatrix<N> = this mi other
public fun <N : AbsorbentWithNumbers<N>> ShortMatrix.minus(other: Matrix<N>): Matrix<N> = other mi this
public fun <N : AbsorbentWithNumbers<N>> ShortImageMatrix.minus(other: Matrix<N>): ImageMatrix<N> = other mi this
public fun <N : AbsorbentWithNumbers<N>> ShortMatrix.minus(other: ImageMatrix<N>): ImageMatrix<N> = other mi this

public fun <N : AbsorbentWithNumbers<N>> Matrix<N>.minus(other: ByteMatrix): Matrix<N> = this mi other
public fun <N : AbsorbentWithNumbers<N>> Matrix<N>.minus(other: ByteImageMatrix): ImageMatrix<N> = this mi other
public fun <N : AbsorbentWithNumbers<N>> ImageMatrix<N>.minus(other: ByteMatrix): ImageMatrix<N> = this mi other
public fun <N : AbsorbentWithNumbers<N>> ByteMatrix.minus(other: Matrix<N>): Matrix<N> = other mi this
public fun <N : AbsorbentWithNumbers<N>> ByteImageMatrix.minus(other: Matrix<N>): ImageMatrix<N> = other mi this
public fun <N : AbsorbentWithNumbers<N>> ByteMatrix.minus(other: ImageMatrix<N>): ImageMatrix<N> = other mi this

private fun DoubleMatrix.mi(other: DoubleMatrix): DoubleImageMatrix {
    val im = coordinatewiseOperation(this, other) {
        (x, y) -> x - y
    }
    return object : DoubleImageMatrix, ImageMatrix<Double> by im {}
}
private fun DoubleMatrix.mi(other: FloatMatrix): DoubleImageMatrix {
    val im = coordinatewiseOperation(this, other) {
        (x, y) -> x - y
    }
    return object : DoubleImageMatrix, ImageMatrix<Double> by im {}
}
private fun DoubleMatrix.mi(other: LongMatrix): DoubleImageMatrix {
    val im = coordinatewiseOperation(this, other) {
        (x, y) -> x - y
    }
    return object : DoubleImageMatrix, ImageMatrix<Double> by im {}
}
private fun DoubleMatrix.mi(other: IntMatrix): DoubleImageMatrix {
    val im = coordinatewiseOperation(this, other) {
        (x, y) -> x - y
    }
    return object : DoubleImageMatrix, ImageMatrix<Double> by im {}
}
private fun DoubleMatrix.mi(other: ShortMatrix): DoubleImageMatrix {
    val im = coordinatewiseOperation(this, other) {
        (x, y) -> x - y
    }
    return object : DoubleImageMatrix, ImageMatrix<Double> by im {}
}
private fun DoubleMatrix.mi(other: ByteMatrix): DoubleImageMatrix {
    val im = coordinatewiseOperation(this, other) {
        (x, y) -> x - y.to255Int()
    }
    return object : DoubleImageMatrix, ImageMatrix<Double> by im {}
}

private fun FloatMatrix.mi(other: FloatMatrix): FloatImageMatrix {
    val im = coordinatewiseOperation(this, other) {
        (x, y) -> x - y
    }
    return object : FloatImageMatrix, ImageMatrix<Float> by im {}
}
private fun FloatMatrix.mi(other: LongMatrix): FloatImageMatrix {
    val im = coordinatewiseOperation(this, other) {
        (x, y) -> x - y
    }
    return object : FloatImageMatrix, ImageMatrix<Float> by im {}
}
private fun FloatMatrix.mi(other: IntMatrix): FloatImageMatrix {
    val im = coordinatewiseOperation(this, other) {
        (x, y) -> x - y
    }
    return object : FloatImageMatrix, ImageMatrix<Float> by im {}
}
private fun FloatMatrix.mi(other: ShortMatrix): FloatImageMatrix {
    val im = coordinatewiseOperation(this, other) {
        (x, y) -> x - y
    }
    return object : FloatImageMatrix, ImageMatrix<Float> by im {}
}
private fun FloatMatrix.mi(other: ByteMatrix): FloatImageMatrix {
    val im = coordinatewiseOperation(this, other) {
        (x, y) -> x - y.to255Int()
    }
    return object : FloatImageMatrix, ImageMatrix<Float> by im {}
}

private fun LongMatrix.mi(other: LongMatrix): LongImageMatrix {
    val im = coordinatewiseOperation(this, other) {
        (x, y) -> x - y
    }
    return object : LongImageMatrix, ImageMatrix<Long> by im {}
}
private fun LongMatrix.mi(other: IntMatrix): LongImageMatrix {
    val im = coordinatewiseOperation(this, other) {
        (x, y) -> x - y
    }
    return object : LongImageMatrix, ImageMatrix<Long> by im {}
}
private fun LongMatrix.mi(other: ShortMatrix): LongImageMatrix {
    val im = coordinatewiseOperation(this, other) {
        (x, y) -> x - y
    }
    return object : LongImageMatrix, ImageMatrix<Long> by im {}
}
private fun LongMatrix.mi(other: ByteMatrix): LongImageMatrix {
    val im = coordinatewiseOperation(this, other) {
        (x, y) -> x - y.to255Int()
    }
    return object : LongImageMatrix, ImageMatrix<Long> by im {}
}

private fun IntMatrix.mi(other: IntMatrix): IntImageMatrix {
    val im = coordinatewiseOperation(this, other) {
        (x, y) -> x - y
    }
    return object : IntImageMatrix, ImageMatrix<Int> by im {}
}
private fun IntMatrix.mi(other: ShortMatrix): IntImageMatrix {
    val im = coordinatewiseOperation(this, other) {
        (x, y) -> x - y
    }
    return object : IntImageMatrix, ImageMatrix<Int> by im {}
}
private fun IntMatrix.mi(other: ByteMatrix): IntImageMatrix {
    val im = coordinatewiseOperation(this, other) {
        (x, y) -> x - y.to255Int()
    }
    return object : IntImageMatrix, ImageMatrix<Int> by im {}
}

private fun ShortMatrix.mi(other: ShortMatrix): ShortImageMatrix {
    val im = coordinatewiseOperation(this, other) {
        (x, y) -> (x - y).toShort()
    }
    return object : ShortImageMatrix, ImageMatrix<Short> by im {}
}
private fun ShortMatrix.mi(other: ByteMatrix): ShortImageMatrix {
    val im = coordinatewiseOperation(this, other) {
        (x, y) -> (x - y.to255Int()).toShort()
    }
    return object : ShortImageMatrix, ImageMatrix<Short> by im {}
}

private fun ByteMatrix.mi(other: ByteMatrix): ByteImageMatrix {
    val im = coordinatewiseOperation(this, other) {
        (x, y) -> (x - y.to255Int()).toByte()
    }
    return object : ByteImageMatrix, ImageMatrix<Byte> by im {}
}


public fun DoubleMatrix.minus(other: DoubleMatrix): DoubleMatrix = this mi other
public fun DoubleImageMatrix.minus(other: DoubleMatrix): DoubleImageMatrix = this mi other
public fun DoubleMatrix.minus(other: DoubleImageMatrix): DoubleImageMatrix = this mi other

public fun FloatMatrix.minus(other: FloatMatrix): FloatMatrix = this mi other
public fun FloatImageMatrix.minus(other: FloatMatrix): FloatImageMatrix = this mi other
public fun FloatMatrix.minus(other: FloatImageMatrix): FloatImageMatrix = this mi other

public fun LongMatrix.minus(other: LongMatrix): LongMatrix = this mi other
public fun LongImageMatrix.minus(other: LongMatrix): LongImageMatrix = this mi other
public fun LongMatrix.minus(other: LongImageMatrix): LongImageMatrix = this mi other

public fun IntMatrix.minus(other: IntMatrix): IntMatrix = this mi other
public fun IntImageMatrix.minus(other: IntMatrix): IntImageMatrix = this mi other
public fun IntMatrix.minus(other: IntImageMatrix): IntImageMatrix = this mi other

public fun ShortMatrix.minus(other: ShortMatrix): ShortMatrix = this mi other
public fun ShortImageMatrix.minus(other: ShortMatrix): ShortImageMatrix = this mi other
public fun ShortMatrix.minus(other: ShortImageMatrix): ShortImageMatrix = this mi other

public fun ByteMatrix.minus(other: ByteMatrix): ByteMatrix = this mi other
public fun ByteImageMatrix.minus(other: ByteMatrix): ByteImageMatrix = this mi other
public fun ByteMatrix.minus(other: ByteImageMatrix): ByteImageMatrix = this mi other

//Double
public fun DoubleMatrix.minus(other: FloatMatrix): DoubleMatrix = this mi other
public fun DoubleImageMatrix.minus(other: FloatMatrix): DoubleImageMatrix = this mi other
public fun DoubleMatrix.minus(other: FloatImageMatrix): DoubleImageMatrix = this mi other
public fun FloatMatrix.minus(other: DoubleMatrix): DoubleMatrix = other mi this
public fun FloatMatrix.minus(other: DoubleImageMatrix): DoubleImageMatrix = other mi this
public fun FloatImageMatrix.minus(other: DoubleMatrix): DoubleImageMatrix = other mi this

public fun DoubleMatrix.minus(other: LongMatrix): DoubleMatrix = this mi other
public fun DoubleImageMatrix.minus(other: LongMatrix): DoubleImageMatrix = this mi other
public fun DoubleMatrix.minus(other: LongImageMatrix): DoubleImageMatrix = this mi other
public fun LongMatrix.minus(other: DoubleMatrix): DoubleMatrix = other mi this
public fun LongMatrix.minus(other: DoubleImageMatrix): DoubleImageMatrix = other mi this
public fun LongImageMatrix.minus(other: DoubleMatrix): DoubleImageMatrix = other mi this

public fun DoubleMatrix.minus(other: IntMatrix): DoubleMatrix = this mi other
public fun DoubleImageMatrix.minus(other: IntMatrix): DoubleImageMatrix = this mi other
public fun DoubleMatrix.minus(other: IntImageMatrix): DoubleImageMatrix = this mi other
public fun IntMatrix.minus(other: DoubleMatrix): DoubleMatrix = other mi this
public fun IntMatrix.minus(other: DoubleImageMatrix): DoubleImageMatrix = other mi this
public fun IntImageMatrix.minus(other: DoubleMatrix): DoubleImageMatrix = other mi this

public fun DoubleMatrix.minus(other: ShortMatrix): DoubleMatrix = this mi other
public fun DoubleImageMatrix.minus(other: ShortMatrix): DoubleImageMatrix = this mi other
public fun DoubleMatrix.minus(other: ShortImageMatrix): DoubleImageMatrix = this mi other
public fun ShortMatrix.minus(other: DoubleMatrix): DoubleMatrix = other mi this
public fun ShortMatrix.minus(other: DoubleImageMatrix): DoubleImageMatrix = other mi this
public fun ShortImageMatrix.minus(other: DoubleMatrix): DoubleImageMatrix = other mi this

public fun DoubleMatrix.minus(other: ByteMatrix): DoubleMatrix = this mi other
public fun DoubleImageMatrix.minus(other: ByteMatrix): DoubleImageMatrix = this mi other
public fun DoubleMatrix.minus(other: ByteImageMatrix): DoubleImageMatrix = this mi other
public fun ByteMatrix.minus(other: DoubleMatrix): DoubleMatrix = other mi this
public fun ByteMatrix.minus(other: DoubleImageMatrix): DoubleImageMatrix = other mi this
public fun ByteImageMatrix.minus(other: DoubleMatrix): DoubleImageMatrix = other mi this

//Float
public fun FloatMatrix.minus(other: LongMatrix): FloatMatrix = this mi other
public fun FloatImageMatrix.minus(other: LongMatrix): FloatImageMatrix = this mi other
public fun FloatMatrix.minus(other: LongImageMatrix): FloatImageMatrix = this mi other
public fun LongMatrix.minus(other: FloatMatrix): FloatMatrix = other mi this
public fun LongMatrix.minus(other: FloatImageMatrix): FloatImageMatrix = other mi this
public fun LongImageMatrix.minus(other: FloatMatrix): FloatImageMatrix = other mi this

public fun FloatMatrix.minus(other: IntMatrix): FloatMatrix = this mi other
public fun FloatImageMatrix.minus(other: IntMatrix): FloatImageMatrix = this mi other
public fun FloatMatrix.minus(other: IntImageMatrix): FloatImageMatrix = this mi other
public fun IntMatrix.minus(other: FloatMatrix): FloatMatrix = other mi this
public fun IntMatrix.minus(other: FloatImageMatrix): FloatImageMatrix = other mi this
public fun IntImageMatrix.minus(other: FloatMatrix): FloatImageMatrix = other mi this

public fun FloatMatrix.minus(other: ShortMatrix): FloatMatrix = this mi other
public fun FloatImageMatrix.minus(other: ShortMatrix): FloatImageMatrix = this mi other
public fun FloatMatrix.minus(other: ShortImageMatrix): FloatImageMatrix = this mi other
public fun ShortMatrix.minus(other: FloatMatrix): FloatMatrix = other mi this
public fun ShortMatrix.minus(other: FloatImageMatrix): FloatImageMatrix = other mi this
public fun ShortImageMatrix.minus(other: FloatMatrix): FloatImageMatrix = other mi this

public fun FloatMatrix.minus(other: ByteMatrix): FloatMatrix = this mi other
public fun FloatImageMatrix.minus(other: ByteMatrix): FloatImageMatrix = this mi other
public fun FloatMatrix.minus(other: ByteImageMatrix): FloatImageMatrix = this mi other
public fun ByteMatrix.minus(other: FloatMatrix): FloatMatrix = other mi this
public fun ByteMatrix.minus(other: FloatImageMatrix): FloatImageMatrix = other mi this
public fun ByteImageMatrix.minus(other: FloatMatrix): FloatImageMatrix = other mi this

//Long
public fun LongMatrix.minus(other: IntMatrix): LongMatrix = this mi other
public fun LongImageMatrix.minus(other: IntMatrix): LongImageMatrix = this mi other
public fun LongMatrix.minus(other: IntImageMatrix): LongImageMatrix = this mi other
public fun IntMatrix.minus(other: LongMatrix): LongMatrix = other mi this
public fun IntMatrix.minus(other: LongImageMatrix): LongImageMatrix = other mi this
public fun IntImageMatrix.minus(other: LongMatrix): LongImageMatrix = other mi this

public fun LongMatrix.minus(other: ShortMatrix): LongMatrix = this mi other
public fun LongImageMatrix.minus(other: ShortMatrix): LongImageMatrix = this mi other
public fun LongMatrix.minus(other: ShortImageMatrix): LongImageMatrix = this mi other
public fun ShortMatrix.minus(other: LongMatrix): LongMatrix = other mi this
public fun ShortMatrix.minus(other: LongImageMatrix): LongImageMatrix = other mi this
public fun ShortImageMatrix.minus(other: LongMatrix): LongImageMatrix = other mi this

public fun LongMatrix.minus(other: ByteMatrix): LongMatrix = this mi other
public fun LongImageMatrix.minus(other: ByteMatrix): LongImageMatrix = this mi other
public fun LongMatrix.minus(other: ByteImageMatrix): LongImageMatrix = this mi other
public fun ByteMatrix.minus(other: LongMatrix): LongMatrix = other mi this
public fun ByteMatrix.minus(other: LongImageMatrix): LongImageMatrix = other mi this
public fun ByteImageMatrix.minus(other: LongMatrix): LongImageMatrix = other mi this

//Int
public fun IntMatrix.minus(other: ShortMatrix): IntMatrix = this mi other
public fun IntImageMatrix.minus(other: ShortMatrix): IntImageMatrix = this mi other
public fun IntMatrix.minus(other: ShortImageMatrix): IntImageMatrix = this mi other
public fun ShortMatrix.minus(other: IntMatrix): IntMatrix = other mi this
public fun ShortMatrix.minus(other: IntImageMatrix): IntImageMatrix = other mi this
public fun ShortImageMatrix.minus(other: IntMatrix): IntImageMatrix = other mi this

public fun IntMatrix.minus(other: ByteMatrix): IntMatrix = this mi other
public fun IntImageMatrix.minus(other: ByteMatrix): IntImageMatrix = this mi other
public fun IntMatrix.minus(other: ByteImageMatrix): IntImageMatrix = this mi other
public fun ByteMatrix.minus(other: IntMatrix): IntMatrix = other mi this
public fun ByteMatrix.minus(other: IntImageMatrix): IntImageMatrix = other mi this
public fun ByteImageMatrix.minus(other: IntMatrix): IntImageMatrix = other mi this

//Short
public fun ShortMatrix.minus(other: ByteMatrix): ShortMatrix = this mi other
public fun ShortImageMatrix.minus(other: ByteMatrix): ShortImageMatrix = this mi other
public fun ShortMatrix.minus(other: ByteImageMatrix): ShortImageMatrix = this mi other
public fun ByteMatrix.minus(other: ShortMatrix): ShortMatrix = other mi this
public fun ByteMatrix.minus(other: ShortImageMatrix): ShortImageMatrix = other mi this
public fun ByteImageMatrix.minus(other: ShortMatrix): ShortImageMatrix = other mi this

