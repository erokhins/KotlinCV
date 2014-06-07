package org.hanuna.kotlincv.special

import org.hanuna.math.AbsorbentWithNumbers
import org.hanuna.math.to255Int
import org.hanuna.kotlincv.*

private fun <N : AbsorbentWithNumbers<N>> Matrix<N>.ti(other: DoubleMatrix): ImageMatrix<N>
        = coordinatewiseOperation(this, other) {
    (x, y) -> with(this.sample.withDouble) {x * y}
}
private fun <N : AbsorbentWithNumbers<N>> Matrix<N>.ti(other: FloatMatrix): ImageMatrix<N>
        = coordinatewiseOperation(this, other) {
    (x, y) -> with(this.sample.withFloat) {x * y}
}
private fun <N : AbsorbentWithNumbers<N>> Matrix<N>.ti(other: LongMatrix): ImageMatrix<N>
        = coordinatewiseOperation(this, other) {
    (x, y) -> with(this.sample.withLong) {x * y}
}
private fun <N : AbsorbentWithNumbers<N>> Matrix<N>.ti(other: IntMatrix): ImageMatrix<N>
        = coordinatewiseOperation(this, other) {
    (x, y) -> with(this.sample.withInt) {x * y}
}
private fun <N : AbsorbentWithNumbers<N>> Matrix<N>.ti(other: ShortMatrix): ImageMatrix<N>
        = coordinatewiseOperation(this, other) {
    (x, y) -> with(this.sample.withShort) {x * y}
}
private fun <N : AbsorbentWithNumbers<N>> Matrix<N>.ti(other: ByteMatrix): ImageMatrix<N>
        = coordinatewiseOperation(this, other) {
    (x, y) -> with(this.sample.withByte) {x * y}
}

public fun <N : AbsorbentWithNumbers<N>> Matrix<N>.times(other: DoubleMatrix): Matrix<N> = this ti other
public fun <N : AbsorbentWithNumbers<N>> Matrix<N>.times(other: DoubleImageMatrix): ImageMatrix<N> = this ti other
public fun <N : AbsorbentWithNumbers<N>> ImageMatrix<N>.times(other: DoubleMatrix): ImageMatrix<N> = this ti other
public fun <N : AbsorbentWithNumbers<N>> DoubleMatrix.times(other: Matrix<N>): Matrix<N> = other ti this
public fun <N : AbsorbentWithNumbers<N>> DoubleImageMatrix.times(other: Matrix<N>): ImageMatrix<N> = other ti this
public fun <N : AbsorbentWithNumbers<N>> DoubleMatrix.times(other: ImageMatrix<N>): ImageMatrix<N> = other ti this

public fun <N : AbsorbentWithNumbers<N>> Matrix<N>.times(other: FloatMatrix): Matrix<N> = this ti other
public fun <N : AbsorbentWithNumbers<N>> Matrix<N>.times(other: FloatImageMatrix): ImageMatrix<N> = this ti other
public fun <N : AbsorbentWithNumbers<N>> ImageMatrix<N>.times(other: FloatMatrix): ImageMatrix<N> = this ti other
public fun <N : AbsorbentWithNumbers<N>> FloatMatrix.times(other: Matrix<N>): Matrix<N> = other ti this
public fun <N : AbsorbentWithNumbers<N>> FloatImageMatrix.times(other: Matrix<N>): ImageMatrix<N> = other ti this
public fun <N : AbsorbentWithNumbers<N>> FloatMatrix.times(other: ImageMatrix<N>): ImageMatrix<N> = other ti this

public fun <N : AbsorbentWithNumbers<N>> Matrix<N>.times(other: LongMatrix): Matrix<N> = this ti other
public fun <N : AbsorbentWithNumbers<N>> Matrix<N>.times(other: LongImageMatrix): ImageMatrix<N> = this ti other
public fun <N : AbsorbentWithNumbers<N>> ImageMatrix<N>.times(other: LongMatrix): ImageMatrix<N> = this ti other
public fun <N : AbsorbentWithNumbers<N>> LongMatrix.times(other: Matrix<N>): Matrix<N> = other ti this
public fun <N : AbsorbentWithNumbers<N>> LongImageMatrix.times(other: Matrix<N>): ImageMatrix<N> = other ti this
public fun <N : AbsorbentWithNumbers<N>> LongMatrix.times(other: ImageMatrix<N>): ImageMatrix<N> = other ti this

public fun <N : AbsorbentWithNumbers<N>> Matrix<N>.times(other: IntMatrix): Matrix<N> = this ti other
public fun <N : AbsorbentWithNumbers<N>> Matrix<N>.times(other: IntImageMatrix): ImageMatrix<N> = this ti other
public fun <N : AbsorbentWithNumbers<N>> ImageMatrix<N>.times(other: IntMatrix): ImageMatrix<N> = this ti other
public fun <N : AbsorbentWithNumbers<N>> IntMatrix.times(other: Matrix<N>): Matrix<N> = other ti this
public fun <N : AbsorbentWithNumbers<N>> IntImageMatrix.times(other: Matrix<N>): ImageMatrix<N> = other ti this
public fun <N : AbsorbentWithNumbers<N>> IntMatrix.times(other: ImageMatrix<N>): ImageMatrix<N> = other ti this

public fun <N : AbsorbentWithNumbers<N>> Matrix<N>.times(other: ShortMatrix): Matrix<N> = this ti other
public fun <N : AbsorbentWithNumbers<N>> Matrix<N>.times(other: ShortImageMatrix): ImageMatrix<N> = this ti other
public fun <N : AbsorbentWithNumbers<N>> ImageMatrix<N>.times(other: ShortMatrix): ImageMatrix<N> = this ti other
public fun <N : AbsorbentWithNumbers<N>> ShortMatrix.times(other: Matrix<N>): Matrix<N> = other ti this
public fun <N : AbsorbentWithNumbers<N>> ShortImageMatrix.times(other: Matrix<N>): ImageMatrix<N> = other ti this
public fun <N : AbsorbentWithNumbers<N>> ShortMatrix.times(other: ImageMatrix<N>): ImageMatrix<N> = other ti this

public fun <N : AbsorbentWithNumbers<N>> Matrix<N>.times(other: ByteMatrix): Matrix<N> = this ti other
public fun <N : AbsorbentWithNumbers<N>> Matrix<N>.times(other: ByteImageMatrix): ImageMatrix<N> = this ti other
public fun <N : AbsorbentWithNumbers<N>> ImageMatrix<N>.times(other: ByteMatrix): ImageMatrix<N> = this ti other
public fun <N : AbsorbentWithNumbers<N>> ByteMatrix.times(other: Matrix<N>): Matrix<N> = other ti this
public fun <N : AbsorbentWithNumbers<N>> ByteImageMatrix.times(other: Matrix<N>): ImageMatrix<N> = other ti this
public fun <N : AbsorbentWithNumbers<N>> ByteMatrix.times(other: ImageMatrix<N>): ImageMatrix<N> = other ti this

private fun DoubleMatrix.ti(other: DoubleMatrix): DoubleImageMatrix {
    val im = coordinatewiseOperation(this, other) {
        (x, y) -> x * y
    }
    return object : DoubleImageMatrix, ImageMatrix<Double> by im {}
}
private fun DoubleMatrix.ti(other: FloatMatrix): DoubleImageMatrix {
    val im = coordinatewiseOperation(this, other) {
        (x, y) -> x * y
    }
    return object : DoubleImageMatrix, ImageMatrix<Double> by im {}
}
private fun DoubleMatrix.ti(other: LongMatrix): DoubleImageMatrix {
    val im = coordinatewiseOperation(this, other) {
        (x, y) -> x * y
    }
    return object : DoubleImageMatrix, ImageMatrix<Double> by im {}
}
private fun DoubleMatrix.ti(other: IntMatrix): DoubleImageMatrix {
    val im = coordinatewiseOperation(this, other) {
        (x, y) -> x * y
    }
    return object : DoubleImageMatrix, ImageMatrix<Double> by im {}
}
private fun DoubleMatrix.ti(other: ShortMatrix): DoubleImageMatrix {
    val im = coordinatewiseOperation(this, other) {
        (x, y) -> x * y
    }
    return object : DoubleImageMatrix, ImageMatrix<Double> by im {}
}
private fun DoubleMatrix.ti(other: ByteMatrix): DoubleImageMatrix {
    val im = coordinatewiseOperation(this, other) {
        (x, y) -> x * y.to255Int()
    }
    return object : DoubleImageMatrix, ImageMatrix<Double> by im {}
}

private fun FloatMatrix.ti(other: FloatMatrix): FloatImageMatrix {
    val im = coordinatewiseOperation(this, other) {
        (x, y) -> x * y
    }
    return object : FloatImageMatrix, ImageMatrix<Float> by im {}
}
private fun FloatMatrix.ti(other: LongMatrix): FloatImageMatrix {
    val im = coordinatewiseOperation(this, other) {
        (x, y) -> x * y
    }
    return object : FloatImageMatrix, ImageMatrix<Float> by im {}
}
private fun FloatMatrix.ti(other: IntMatrix): FloatImageMatrix {
    val im = coordinatewiseOperation(this, other) {
        (x, y) -> x * y
    }
    return object : FloatImageMatrix, ImageMatrix<Float> by im {}
}
private fun FloatMatrix.ti(other: ShortMatrix): FloatImageMatrix {
    val im = coordinatewiseOperation(this, other) {
        (x, y) -> x * y
    }
    return object : FloatImageMatrix, ImageMatrix<Float> by im {}
}
private fun FloatMatrix.ti(other: ByteMatrix): FloatImageMatrix {
    val im = coordinatewiseOperation(this, other) {
        (x, y) -> x * y.to255Int()
    }
    return object : FloatImageMatrix, ImageMatrix<Float> by im {}
}

private fun LongMatrix.ti(other: LongMatrix): LongImageMatrix {
    val im = coordinatewiseOperation(this, other) {
        (x, y) -> x * y
    }
    return object : LongImageMatrix, ImageMatrix<Long> by im {}
}
private fun LongMatrix.ti(other: IntMatrix): LongImageMatrix {
    val im = coordinatewiseOperation(this, other) {
        (x, y) -> x * y
    }
    return object : LongImageMatrix, ImageMatrix<Long> by im {}
}
private fun LongMatrix.ti(other: ShortMatrix): LongImageMatrix {
    val im = coordinatewiseOperation(this, other) {
        (x, y) -> x * y
    }
    return object : LongImageMatrix, ImageMatrix<Long> by im {}
}
private fun LongMatrix.ti(other: ByteMatrix): LongImageMatrix {
    val im = coordinatewiseOperation(this, other) {
        (x, y) -> x * y.to255Int()
    }
    return object : LongImageMatrix, ImageMatrix<Long> by im {}
}

private fun IntMatrix.ti(other: IntMatrix): IntImageMatrix {
    val im = coordinatewiseOperation(this, other) {
        (x, y) -> x * y
    }
    return object : IntImageMatrix, ImageMatrix<Int> by im {}
}
private fun IntMatrix.ti(other: ShortMatrix): IntImageMatrix {
    val im = coordinatewiseOperation(this, other) {
        (x, y) -> x * y
    }
    return object : IntImageMatrix, ImageMatrix<Int> by im {}
}
private fun IntMatrix.ti(other: ByteMatrix): IntImageMatrix {
    val im = coordinatewiseOperation(this, other) {
        (x, y) -> x * y.to255Int()
    }
    return object : IntImageMatrix, ImageMatrix<Int> by im {}
}

private fun ShortMatrix.ti(other: ShortMatrix): ShortImageMatrix {
    val im = coordinatewiseOperation(this, other) {
        (x, y) -> (x * y).toShort()
    }
    return object : ShortImageMatrix, ImageMatrix<Short> by im {}
}
private fun ShortMatrix.ti(other: ByteMatrix): ShortImageMatrix {
    val im = coordinatewiseOperation(this, other) {
        (x, y) -> (x * y.to255Int()).toShort()
    }
    return object : ShortImageMatrix, ImageMatrix<Short> by im {}
}

private fun ByteMatrix.ti(other: ByteMatrix): ByteImageMatrix {
    val im = coordinatewiseOperation(this, other) {
        (x, y) -> (x * y.to255Int()).toByte()
    }
    return object : ByteImageMatrix, ImageMatrix<Byte> by im {}
}


public fun DoubleMatrix.times(other: DoubleMatrix): DoubleMatrix = this ti other
public fun DoubleImageMatrix.times(other: DoubleMatrix): DoubleImageMatrix = this ti other
public fun DoubleMatrix.times(other: DoubleImageMatrix): DoubleImageMatrix = this ti other

public fun FloatMatrix.times(other: FloatMatrix): FloatMatrix = this ti other
public fun FloatImageMatrix.times(other: FloatMatrix): FloatImageMatrix = this ti other
public fun FloatMatrix.times(other: FloatImageMatrix): FloatImageMatrix = this ti other

public fun LongMatrix.times(other: LongMatrix): LongMatrix = this ti other
public fun LongImageMatrix.times(other: LongMatrix): LongImageMatrix = this ti other
public fun LongMatrix.times(other: LongImageMatrix): LongImageMatrix = this ti other

public fun IntMatrix.times(other: IntMatrix): IntMatrix = this ti other
public fun IntImageMatrix.times(other: IntMatrix): IntImageMatrix = this ti other
public fun IntMatrix.times(other: IntImageMatrix): IntImageMatrix = this ti other

public fun ShortMatrix.times(other: ShortMatrix): ShortMatrix = this ti other
public fun ShortImageMatrix.times(other: ShortMatrix): ShortImageMatrix = this ti other
public fun ShortMatrix.times(other: ShortImageMatrix): ShortImageMatrix = this ti other

public fun ByteMatrix.times(other: ByteMatrix): ByteMatrix = this ti other
public fun ByteImageMatrix.times(other: ByteMatrix): ByteImageMatrix = this ti other
public fun ByteMatrix.times(other: ByteImageMatrix): ByteImageMatrix = this ti other

//Double
public fun DoubleMatrix.times(other: FloatMatrix): DoubleMatrix = this ti other
public fun DoubleImageMatrix.times(other: FloatMatrix): DoubleImageMatrix = this ti other
public fun DoubleMatrix.times(other: FloatImageMatrix): DoubleImageMatrix = this ti other
public fun FloatMatrix.times(other: DoubleMatrix): DoubleMatrix = other ti this
public fun FloatMatrix.times(other: DoubleImageMatrix): DoubleImageMatrix = other ti this
public fun FloatImageMatrix.times(other: DoubleMatrix): DoubleImageMatrix = other ti this

public fun DoubleMatrix.times(other: LongMatrix): DoubleMatrix = this ti other
public fun DoubleImageMatrix.times(other: LongMatrix): DoubleImageMatrix = this ti other
public fun DoubleMatrix.times(other: LongImageMatrix): DoubleImageMatrix = this ti other
public fun LongMatrix.times(other: DoubleMatrix): DoubleMatrix = other ti this
public fun LongMatrix.times(other: DoubleImageMatrix): DoubleImageMatrix = other ti this
public fun LongImageMatrix.times(other: DoubleMatrix): DoubleImageMatrix = other ti this

public fun DoubleMatrix.times(other: IntMatrix): DoubleMatrix = this ti other
public fun DoubleImageMatrix.times(other: IntMatrix): DoubleImageMatrix = this ti other
public fun DoubleMatrix.times(other: IntImageMatrix): DoubleImageMatrix = this ti other
public fun IntMatrix.times(other: DoubleMatrix): DoubleMatrix = other ti this
public fun IntMatrix.times(other: DoubleImageMatrix): DoubleImageMatrix = other ti this
public fun IntImageMatrix.times(other: DoubleMatrix): DoubleImageMatrix = other ti this

public fun DoubleMatrix.times(other: ShortMatrix): DoubleMatrix = this ti other
public fun DoubleImageMatrix.times(other: ShortMatrix): DoubleImageMatrix = this ti other
public fun DoubleMatrix.times(other: ShortImageMatrix): DoubleImageMatrix = this ti other
public fun ShortMatrix.times(other: DoubleMatrix): DoubleMatrix = other ti this
public fun ShortMatrix.times(other: DoubleImageMatrix): DoubleImageMatrix = other ti this
public fun ShortImageMatrix.times(other: DoubleMatrix): DoubleImageMatrix = other ti this

public fun DoubleMatrix.times(other: ByteMatrix): DoubleMatrix = this ti other
public fun DoubleImageMatrix.times(other: ByteMatrix): DoubleImageMatrix = this ti other
public fun DoubleMatrix.times(other: ByteImageMatrix): DoubleImageMatrix = this ti other
public fun ByteMatrix.times(other: DoubleMatrix): DoubleMatrix = other ti this
public fun ByteMatrix.times(other: DoubleImageMatrix): DoubleImageMatrix = other ti this
public fun ByteImageMatrix.times(other: DoubleMatrix): DoubleImageMatrix = other ti this

//Float
public fun FloatMatrix.times(other: LongMatrix): FloatMatrix = this ti other
public fun FloatImageMatrix.times(other: LongMatrix): FloatImageMatrix = this ti other
public fun FloatMatrix.times(other: LongImageMatrix): FloatImageMatrix = this ti other
public fun LongMatrix.times(other: FloatMatrix): FloatMatrix = other ti this
public fun LongMatrix.times(other: FloatImageMatrix): FloatImageMatrix = other ti this
public fun LongImageMatrix.times(other: FloatMatrix): FloatImageMatrix = other ti this

public fun FloatMatrix.times(other: IntMatrix): FloatMatrix = this ti other
public fun FloatImageMatrix.times(other: IntMatrix): FloatImageMatrix = this ti other
public fun FloatMatrix.times(other: IntImageMatrix): FloatImageMatrix = this ti other
public fun IntMatrix.times(other: FloatMatrix): FloatMatrix = other ti this
public fun IntMatrix.times(other: FloatImageMatrix): FloatImageMatrix = other ti this
public fun IntImageMatrix.times(other: FloatMatrix): FloatImageMatrix = other ti this

public fun FloatMatrix.times(other: ShortMatrix): FloatMatrix = this ti other
public fun FloatImageMatrix.times(other: ShortMatrix): FloatImageMatrix = this ti other
public fun FloatMatrix.times(other: ShortImageMatrix): FloatImageMatrix = this ti other
public fun ShortMatrix.times(other: FloatMatrix): FloatMatrix = other ti this
public fun ShortMatrix.times(other: FloatImageMatrix): FloatImageMatrix = other ti this
public fun ShortImageMatrix.times(other: FloatMatrix): FloatImageMatrix = other ti this

public fun FloatMatrix.times(other: ByteMatrix): FloatMatrix = this ti other
public fun FloatImageMatrix.times(other: ByteMatrix): FloatImageMatrix = this ti other
public fun FloatMatrix.times(other: ByteImageMatrix): FloatImageMatrix = this ti other
public fun ByteMatrix.times(other: FloatMatrix): FloatMatrix = other ti this
public fun ByteMatrix.times(other: FloatImageMatrix): FloatImageMatrix = other ti this
public fun ByteImageMatrix.times(other: FloatMatrix): FloatImageMatrix = other ti this

//Long
public fun LongMatrix.times(other: IntMatrix): LongMatrix = this ti other
public fun LongImageMatrix.times(other: IntMatrix): LongImageMatrix = this ti other
public fun LongMatrix.times(other: IntImageMatrix): LongImageMatrix = this ti other
public fun IntMatrix.times(other: LongMatrix): LongMatrix = other ti this
public fun IntMatrix.times(other: LongImageMatrix): LongImageMatrix = other ti this
public fun IntImageMatrix.times(other: LongMatrix): LongImageMatrix = other ti this

public fun LongMatrix.times(other: ShortMatrix): LongMatrix = this ti other
public fun LongImageMatrix.times(other: ShortMatrix): LongImageMatrix = this ti other
public fun LongMatrix.times(other: ShortImageMatrix): LongImageMatrix = this ti other
public fun ShortMatrix.times(other: LongMatrix): LongMatrix = other ti this
public fun ShortMatrix.times(other: LongImageMatrix): LongImageMatrix = other ti this
public fun ShortImageMatrix.times(other: LongMatrix): LongImageMatrix = other ti this

public fun LongMatrix.times(other: ByteMatrix): LongMatrix = this ti other
public fun LongImageMatrix.times(other: ByteMatrix): LongImageMatrix = this ti other
public fun LongMatrix.times(other: ByteImageMatrix): LongImageMatrix = this ti other
public fun ByteMatrix.times(other: LongMatrix): LongMatrix = other ti this
public fun ByteMatrix.times(other: LongImageMatrix): LongImageMatrix = other ti this
public fun ByteImageMatrix.times(other: LongMatrix): LongImageMatrix = other ti this

//Int
public fun IntMatrix.times(other: ShortMatrix): IntMatrix = this ti other
public fun IntImageMatrix.times(other: ShortMatrix): IntImageMatrix = this ti other
public fun IntMatrix.times(other: ShortImageMatrix): IntImageMatrix = this ti other
public fun ShortMatrix.times(other: IntMatrix): IntMatrix = other ti this
public fun ShortMatrix.times(other: IntImageMatrix): IntImageMatrix = other ti this
public fun ShortImageMatrix.times(other: IntMatrix): IntImageMatrix = other ti this

public fun IntMatrix.times(other: ByteMatrix): IntMatrix = this ti other
public fun IntImageMatrix.times(other: ByteMatrix): IntImageMatrix = this ti other
public fun IntMatrix.times(other: ByteImageMatrix): IntImageMatrix = this ti other
public fun ByteMatrix.times(other: IntMatrix): IntMatrix = other ti this
public fun ByteMatrix.times(other: IntImageMatrix): IntImageMatrix = other ti this
public fun ByteImageMatrix.times(other: IntMatrix): IntImageMatrix = other ti this

//Short
public fun ShortMatrix.times(other: ByteMatrix): ShortMatrix = this ti other
public fun ShortImageMatrix.times(other: ByteMatrix): ShortImageMatrix = this ti other
public fun ShortMatrix.times(other: ByteImageMatrix): ShortImageMatrix = this ti other
public fun ByteMatrix.times(other: ShortMatrix): ShortMatrix = other ti this
public fun ByteMatrix.times(other: ShortImageMatrix): ShortImageMatrix = other ti this
public fun ByteImageMatrix.times(other: ShortMatrix): ShortImageMatrix = other ti this
