package org.hanuna.kotlincv

import org.hanuna.math.AbsorbentWithNumbers
import org.hanuna.math.to255Int

private fun <N : AbsorbentWithNumbers<N>> Matrix<N>.pl(other: DoubleMatrix): ImageMatrix<N>
        = coordinatewiseOperation(this, other) {
    (x, y) -> with(this.sample.withDouble) {x + y}
}
private fun <N : AbsorbentWithNumbers<N>> Matrix<N>.pl(other: FloatMatrix): ImageMatrix<N>
        = coordinatewiseOperation(this, other) {
    (x, y) -> with(this.sample.withFloat) {x + y}
}
private fun <N : AbsorbentWithNumbers<N>> Matrix<N>.pl(other: LongMatrix): ImageMatrix<N>
        = coordinatewiseOperation(this, other) {
    (x, y) -> with(this.sample.withLong) {x + y}
}
private fun <N : AbsorbentWithNumbers<N>> Matrix<N>.pl(other: IntMatrix): ImageMatrix<N>
        = coordinatewiseOperation(this, other) {
    (x, y) -> with(this.sample.withInt) {x + y}
}
private fun <N : AbsorbentWithNumbers<N>> Matrix<N>.pl(other: ShortMatrix): ImageMatrix<N>
        = coordinatewiseOperation(this, other) {
    (x, y) -> with(this.sample.withShort) {x + y}
}
private fun <N : AbsorbentWithNumbers<N>> Matrix<N>.pl(other: ByteMatrix): ImageMatrix<N>
        = coordinatewiseOperation(this, other) {
    (x, y) -> with(this.sample.withByte) {x + y}
}

public fun <N : AbsorbentWithNumbers<N>> Matrix<N>.plus(other: DoubleMatrix): Matrix<N> = this pl other
public fun <N : AbsorbentWithNumbers<N>> Matrix<N>.plus(other: DoubleImageMatrix): ImageMatrix<N> = this pl other
public fun <N : AbsorbentWithNumbers<N>> ImageMatrix<N>.plus(other: DoubleMatrix): ImageMatrix<N> = this pl other
public fun <N : AbsorbentWithNumbers<N>> DoubleMatrix.plus(other: Matrix<N>): Matrix<N> = other pl this
public fun <N : AbsorbentWithNumbers<N>> DoubleImageMatrix.plus(other: Matrix<N>): ImageMatrix<N> = other pl this
public fun <N : AbsorbentWithNumbers<N>> DoubleMatrix.plus(other: ImageMatrix<N>): ImageMatrix<N> = other pl this

public fun <N : AbsorbentWithNumbers<N>> Matrix<N>.plus(other: FloatMatrix): Matrix<N> = this pl other
public fun <N : AbsorbentWithNumbers<N>> Matrix<N>.plus(other: FloatImageMatrix): ImageMatrix<N> = this pl other
public fun <N : AbsorbentWithNumbers<N>> ImageMatrix<N>.plus(other: FloatMatrix): ImageMatrix<N> = this pl other
public fun <N : AbsorbentWithNumbers<N>> FloatMatrix.plus(other: Matrix<N>): Matrix<N> = other pl this
public fun <N : AbsorbentWithNumbers<N>> FloatImageMatrix.plus(other: Matrix<N>): ImageMatrix<N> = other pl this
public fun <N : AbsorbentWithNumbers<N>> FloatMatrix.plus(other: ImageMatrix<N>): ImageMatrix<N> = other pl this

public fun <N : AbsorbentWithNumbers<N>> Matrix<N>.plus(other: LongMatrix): Matrix<N> = this pl other
public fun <N : AbsorbentWithNumbers<N>> Matrix<N>.plus(other: LongImageMatrix): ImageMatrix<N> = this pl other
public fun <N : AbsorbentWithNumbers<N>> ImageMatrix<N>.plus(other: LongMatrix): ImageMatrix<N> = this pl other
public fun <N : AbsorbentWithNumbers<N>> LongMatrix.plus(other: Matrix<N>): Matrix<N> = other pl this
public fun <N : AbsorbentWithNumbers<N>> LongImageMatrix.plus(other: Matrix<N>): ImageMatrix<N> = other pl this
public fun <N : AbsorbentWithNumbers<N>> LongMatrix.plus(other: ImageMatrix<N>): ImageMatrix<N> = other pl this

public fun <N : AbsorbentWithNumbers<N>> Matrix<N>.plus(other: IntMatrix): Matrix<N> = this pl other
public fun <N : AbsorbentWithNumbers<N>> Matrix<N>.plus(other: IntImageMatrix): ImageMatrix<N> = this pl other
public fun <N : AbsorbentWithNumbers<N>> ImageMatrix<N>.plus(other: IntMatrix): ImageMatrix<N> = this pl other
public fun <N : AbsorbentWithNumbers<N>> IntMatrix.plus(other: Matrix<N>): Matrix<N> = other pl this
public fun <N : AbsorbentWithNumbers<N>> IntImageMatrix.plus(other: Matrix<N>): ImageMatrix<N> = other pl this
public fun <N : AbsorbentWithNumbers<N>> IntMatrix.plus(other: ImageMatrix<N>): ImageMatrix<N> = other pl this

public fun <N : AbsorbentWithNumbers<N>> Matrix<N>.plus(other: ShortMatrix): Matrix<N> = this pl other
public fun <N : AbsorbentWithNumbers<N>> Matrix<N>.plus(other: ShortImageMatrix): ImageMatrix<N> = this pl other
public fun <N : AbsorbentWithNumbers<N>> ImageMatrix<N>.plus(other: ShortMatrix): ImageMatrix<N> = this pl other
public fun <N : AbsorbentWithNumbers<N>> ShortMatrix.plus(other: Matrix<N>): Matrix<N> = other pl this
public fun <N : AbsorbentWithNumbers<N>> ShortImageMatrix.plus(other: Matrix<N>): ImageMatrix<N> = other pl this
public fun <N : AbsorbentWithNumbers<N>> ShortMatrix.plus(other: ImageMatrix<N>): ImageMatrix<N> = other pl this

public fun <N : AbsorbentWithNumbers<N>> Matrix<N>.plus(other: ByteMatrix): Matrix<N> = this pl other
public fun <N : AbsorbentWithNumbers<N>> Matrix<N>.plus(other: ByteImageMatrix): ImageMatrix<N> = this pl other
public fun <N : AbsorbentWithNumbers<N>> ImageMatrix<N>.plus(other: ByteMatrix): ImageMatrix<N> = this pl other
public fun <N : AbsorbentWithNumbers<N>> ByteMatrix.plus(other: Matrix<N>): Matrix<N> = other pl this
public fun <N : AbsorbentWithNumbers<N>> ByteImageMatrix.plus(other: Matrix<N>): ImageMatrix<N> = other pl this
public fun <N : AbsorbentWithNumbers<N>> ByteMatrix.plus(other: ImageMatrix<N>): ImageMatrix<N> = other pl this

private fun DoubleMatrix.pl(other: DoubleMatrix): DoubleImageMatrix {
    val im = coordinatewiseOperation(this, other) {
        (x, y) -> x + y
    }
    return object : DoubleImageMatrix, ImageMatrix<Double> by im {}
}
private fun DoubleMatrix.pl(other: FloatMatrix): DoubleImageMatrix {
    val im = coordinatewiseOperation(this, other) {
        (x, y) -> x + y
    }
    return object : DoubleImageMatrix, ImageMatrix<Double> by im {}
}
private fun DoubleMatrix.pl(other: LongMatrix): DoubleImageMatrix {
    val im = coordinatewiseOperation(this, other) {
        (x, y) -> x + y
    }
    return object : DoubleImageMatrix, ImageMatrix<Double> by im {}
}
private fun DoubleMatrix.pl(other: IntMatrix): DoubleImageMatrix {
    val im = coordinatewiseOperation(this, other) {
        (x, y) -> x + y
    }
    return object : DoubleImageMatrix, ImageMatrix<Double> by im {}
}
private fun DoubleMatrix.pl(other: ShortMatrix): DoubleImageMatrix {
    val im = coordinatewiseOperation(this, other) {
        (x, y) -> x + y
    }
    return object : DoubleImageMatrix, ImageMatrix<Double> by im {}
}
private fun DoubleMatrix.pl(other: ByteMatrix): DoubleImageMatrix {
    val im = coordinatewiseOperation(this, other) {
        (x, y) -> x + y.to255Int()
    }
    return object : DoubleImageMatrix, ImageMatrix<Double> by im {}
}

private fun FloatMatrix.pl(other: FloatMatrix): FloatImageMatrix {
    val im = coordinatewiseOperation(this, other) {
        (x, y) -> x + y
    }
    return object : FloatImageMatrix, ImageMatrix<Float> by im {}
}
private fun FloatMatrix.pl(other: LongMatrix): FloatImageMatrix {
    val im = coordinatewiseOperation(this, other) {
        (x, y) -> x + y
    }
    return object : FloatImageMatrix, ImageMatrix<Float> by im {}
}
private fun FloatMatrix.pl(other: IntMatrix): FloatImageMatrix {
    val im = coordinatewiseOperation(this, other) {
        (x, y) -> x + y
    }
    return object : FloatImageMatrix, ImageMatrix<Float> by im {}
}
private fun FloatMatrix.pl(other: ShortMatrix): FloatImageMatrix {
    val im = coordinatewiseOperation(this, other) {
        (x, y) -> x + y
    }
    return object : FloatImageMatrix, ImageMatrix<Float> by im {}
}
private fun FloatMatrix.pl(other: ByteMatrix): FloatImageMatrix {
    val im = coordinatewiseOperation(this, other) {
        (x, y) -> x + y.to255Int()
    }
    return object : FloatImageMatrix, ImageMatrix<Float> by im {}
}

private fun LongMatrix.pl(other: LongMatrix): LongImageMatrix {
    val im = coordinatewiseOperation(this, other) {
        (x, y) -> x + y
    }
    return object : LongImageMatrix, ImageMatrix<Long> by im {}
}
private fun LongMatrix.pl(other: IntMatrix): LongImageMatrix {
    val im = coordinatewiseOperation(this, other) {
        (x, y) -> x + y
    }
    return object : LongImageMatrix, ImageMatrix<Long> by im {}
}
private fun LongMatrix.pl(other: ShortMatrix): LongImageMatrix {
    val im = coordinatewiseOperation(this, other) {
        (x, y) -> x + y
    }
    return object : LongImageMatrix, ImageMatrix<Long> by im {}
}
private fun LongMatrix.pl(other: ByteMatrix): LongImageMatrix {
    val im = coordinatewiseOperation(this, other) {
        (x, y) -> x + y.to255Int()
    }
    return object : LongImageMatrix, ImageMatrix<Long> by im {}
}

private fun IntMatrix.pl(other: IntMatrix): IntImageMatrix {
    val im = coordinatewiseOperation(this, other) {
        (x, y) -> x + y
    }
    return object : IntImageMatrix, ImageMatrix<Int> by im {}
}
private fun IntMatrix.pl(other: ShortMatrix): IntImageMatrix {
    val im = coordinatewiseOperation(this, other) {
        (x, y) -> x + y
    }
    return object : IntImageMatrix, ImageMatrix<Int> by im {}
}
private fun IntMatrix.pl(other: ByteMatrix): IntImageMatrix {
    val im = coordinatewiseOperation(this, other) {
        (x, y) -> x + y.to255Int()
    }
    return object : IntImageMatrix, ImageMatrix<Int> by im {}
}

private fun ShortMatrix.pl(other: ShortMatrix): ShortImageMatrix {
    val im = coordinatewiseOperation(this, other) {
        (x, y) -> (x + y).toShort()
    }
    return object : ShortImageMatrix, ImageMatrix<Short> by im {}
}
private fun ShortMatrix.pl(other: ByteMatrix): ShortImageMatrix {
    val im = coordinatewiseOperation(this, other) {
        (x, y) -> (x + y.to255Int()).toShort()
    }
    return object : ShortImageMatrix, ImageMatrix<Short> by im {}
}

private fun ByteMatrix.pl(other: ByteMatrix): ByteImageMatrix {
    val im = coordinatewiseOperation(this, other) {
        (x, y) -> (x + y.to255Int()).toByte()
    }
    return object : ByteImageMatrix, ImageMatrix<Byte> by im {}
}


public fun DoubleMatrix.plus(other: DoubleMatrix): DoubleMatrix = this pl other
public fun DoubleImageMatrix.plus(other: DoubleMatrix): DoubleImageMatrix = this pl other
public fun DoubleMatrix.plus(other: DoubleImageMatrix): DoubleImageMatrix = this pl other

public fun FloatMatrix.plus(other: FloatMatrix): FloatMatrix = this pl other
public fun FloatImageMatrix.plus(other: FloatMatrix): FloatImageMatrix = this pl other
public fun FloatMatrix.plus(other: FloatImageMatrix): FloatImageMatrix = this pl other

public fun LongMatrix.plus(other: LongMatrix): LongMatrix = this pl other
public fun LongImageMatrix.plus(other: LongMatrix): LongImageMatrix = this pl other
public fun LongMatrix.plus(other: LongImageMatrix): LongImageMatrix = this pl other

public fun IntMatrix.plus(other: IntMatrix): IntMatrix = this pl other
public fun IntImageMatrix.plus(other: IntMatrix): IntImageMatrix = this pl other
public fun IntMatrix.plus(other: IntImageMatrix): IntImageMatrix = this pl other

public fun ShortMatrix.plus(other: ShortMatrix): ShortMatrix = this pl other
public fun ShortImageMatrix.plus(other: ShortMatrix): ShortImageMatrix = this pl other
public fun ShortMatrix.plus(other: ShortImageMatrix): ShortImageMatrix = this pl other

public fun ByteMatrix.plus(other: ByteMatrix): ByteMatrix = this pl other
public fun ByteImageMatrix.plus(other: ByteMatrix): ByteImageMatrix = this pl other
public fun ByteMatrix.plus(other: ByteImageMatrix): ByteImageMatrix = this pl other

//Double
public fun DoubleMatrix.plus(other: FloatMatrix): DoubleMatrix = this pl other
public fun DoubleImageMatrix.plus(other: FloatMatrix): DoubleImageMatrix = this pl other
public fun DoubleMatrix.plus(other: FloatImageMatrix): DoubleImageMatrix = this pl other
public fun FloatMatrix.plus(other: DoubleMatrix): DoubleMatrix = other pl this
public fun FloatMatrix.plus(other: DoubleImageMatrix): DoubleImageMatrix = other pl this
public fun FloatImageMatrix.plus(other: DoubleMatrix): DoubleImageMatrix = other pl this

public fun DoubleMatrix.plus(other: LongMatrix): DoubleMatrix = this pl other
public fun DoubleImageMatrix.plus(other: LongMatrix): DoubleImageMatrix = this pl other
public fun DoubleMatrix.plus(other: LongImageMatrix): DoubleImageMatrix = this pl other
public fun LongMatrix.plus(other: DoubleMatrix): DoubleMatrix = other pl this
public fun LongMatrix.plus(other: DoubleImageMatrix): DoubleImageMatrix = other pl this
public fun LongImageMatrix.plus(other: DoubleMatrix): DoubleImageMatrix = other pl this

public fun DoubleMatrix.plus(other: IntMatrix): DoubleMatrix = this pl other
public fun DoubleImageMatrix.plus(other: IntMatrix): DoubleImageMatrix = this pl other
public fun DoubleMatrix.plus(other: IntImageMatrix): DoubleImageMatrix = this pl other
public fun IntMatrix.plus(other: DoubleMatrix): DoubleMatrix = other pl this
public fun IntMatrix.plus(other: DoubleImageMatrix): DoubleImageMatrix = other pl this
public fun IntImageMatrix.plus(other: DoubleMatrix): DoubleImageMatrix = other pl this

public fun DoubleMatrix.plus(other: ShortMatrix): DoubleMatrix = this pl other
public fun DoubleImageMatrix.plus(other: ShortMatrix): DoubleImageMatrix = this pl other
public fun DoubleMatrix.plus(other: ShortImageMatrix): DoubleImageMatrix = this pl other
public fun ShortMatrix.plus(other: DoubleMatrix): DoubleMatrix = other pl this
public fun ShortMatrix.plus(other: DoubleImageMatrix): DoubleImageMatrix = other pl this
public fun ShortImageMatrix.plus(other: DoubleMatrix): DoubleImageMatrix = other pl this

public fun DoubleMatrix.plus(other: ByteMatrix): DoubleMatrix = this pl other
public fun DoubleImageMatrix.plus(other: ByteMatrix): DoubleImageMatrix = this pl other
public fun DoubleMatrix.plus(other: ByteImageMatrix): DoubleImageMatrix = this pl other
public fun ByteMatrix.plus(other: DoubleMatrix): DoubleMatrix = other pl this
public fun ByteMatrix.plus(other: DoubleImageMatrix): DoubleImageMatrix = other pl this
public fun ByteImageMatrix.plus(other: DoubleMatrix): DoubleImageMatrix = other pl this

//Float
public fun FloatMatrix.plus(other: LongMatrix): FloatMatrix = this pl other
public fun FloatImageMatrix.plus(other: LongMatrix): FloatImageMatrix = this pl other
public fun FloatMatrix.plus(other: LongImageMatrix): FloatImageMatrix = this pl other
public fun LongMatrix.plus(other: FloatMatrix): FloatMatrix = other pl this
public fun LongMatrix.plus(other: FloatImageMatrix): FloatImageMatrix = other pl this
public fun LongImageMatrix.plus(other: FloatMatrix): FloatImageMatrix = other pl this

public fun FloatMatrix.plus(other: IntMatrix): FloatMatrix = this pl other
public fun FloatImageMatrix.plus(other: IntMatrix): FloatImageMatrix = this pl other
public fun FloatMatrix.plus(other: IntImageMatrix): FloatImageMatrix = this pl other
public fun IntMatrix.plus(other: FloatMatrix): FloatMatrix = other pl this
public fun IntMatrix.plus(other: FloatImageMatrix): FloatImageMatrix = other pl this
public fun IntImageMatrix.plus(other: FloatMatrix): FloatImageMatrix = other pl this

public fun FloatMatrix.plus(other: ShortMatrix): FloatMatrix = this pl other
public fun FloatImageMatrix.plus(other: ShortMatrix): FloatImageMatrix = this pl other
public fun FloatMatrix.plus(other: ShortImageMatrix): FloatImageMatrix = this pl other
public fun ShortMatrix.plus(other: FloatMatrix): FloatMatrix = other pl this
public fun ShortMatrix.plus(other: FloatImageMatrix): FloatImageMatrix = other pl this
public fun ShortImageMatrix.plus(other: FloatMatrix): FloatImageMatrix = other pl this

public fun FloatMatrix.plus(other: ByteMatrix): FloatMatrix = this pl other
public fun FloatImageMatrix.plus(other: ByteMatrix): FloatImageMatrix = this pl other
public fun FloatMatrix.plus(other: ByteImageMatrix): FloatImageMatrix = this pl other
public fun ByteMatrix.plus(other: FloatMatrix): FloatMatrix = other pl this
public fun ByteMatrix.plus(other: FloatImageMatrix): FloatImageMatrix = other pl this
public fun ByteImageMatrix.plus(other: FloatMatrix): FloatImageMatrix = other pl this

//Long
public fun LongMatrix.plus(other: IntMatrix): LongMatrix = this pl other
public fun LongImageMatrix.plus(other: IntMatrix): LongImageMatrix = this pl other
public fun LongMatrix.plus(other: IntImageMatrix): LongImageMatrix = this pl other
public fun IntMatrix.plus(other: LongMatrix): LongMatrix = other pl this
public fun IntMatrix.plus(other: LongImageMatrix): LongImageMatrix = other pl this
public fun IntImageMatrix.plus(other: LongMatrix): LongImageMatrix = other pl this

public fun LongMatrix.plus(other: ShortMatrix): LongMatrix = this pl other
public fun LongImageMatrix.plus(other: ShortMatrix): LongImageMatrix = this pl other
public fun LongMatrix.plus(other: ShortImageMatrix): LongImageMatrix = this pl other
public fun ShortMatrix.plus(other: LongMatrix): LongMatrix = other pl this
public fun ShortMatrix.plus(other: LongImageMatrix): LongImageMatrix = other pl this
public fun ShortImageMatrix.plus(other: LongMatrix): LongImageMatrix = other pl this

public fun LongMatrix.plus(other: ByteMatrix): LongMatrix = this pl other
public fun LongImageMatrix.plus(other: ByteMatrix): LongImageMatrix = this pl other
public fun LongMatrix.plus(other: ByteImageMatrix): LongImageMatrix = this pl other
public fun ByteMatrix.plus(other: LongMatrix): LongMatrix = other pl this
public fun ByteMatrix.plus(other: LongImageMatrix): LongImageMatrix = other pl this
public fun ByteImageMatrix.plus(other: LongMatrix): LongImageMatrix = other pl this

//Int
public fun IntMatrix.plus(other: ShortMatrix): IntMatrix = this pl other
public fun IntImageMatrix.plus(other: ShortMatrix): IntImageMatrix = this pl other
public fun IntMatrix.plus(other: ShortImageMatrix): IntImageMatrix = this pl other
public fun ShortMatrix.plus(other: IntMatrix): IntMatrix = other pl this
public fun ShortMatrix.plus(other: IntImageMatrix): IntImageMatrix = other pl this
public fun ShortImageMatrix.plus(other: IntMatrix): IntImageMatrix = other pl this

public fun IntMatrix.plus(other: ByteMatrix): IntMatrix = this pl other
public fun IntImageMatrix.plus(other: ByteMatrix): IntImageMatrix = this pl other
public fun IntMatrix.plus(other: ByteImageMatrix): IntImageMatrix = this pl other
public fun ByteMatrix.plus(other: IntMatrix): IntMatrix = other pl this
public fun ByteMatrix.plus(other: IntImageMatrix): IntImageMatrix = other pl this
public fun ByteImageMatrix.plus(other: IntMatrix): IntImageMatrix = other pl this

//Short
public fun ShortMatrix.plus(other: ByteMatrix): ShortMatrix = this pl other
public fun ShortImageMatrix.plus(other: ByteMatrix): ShortImageMatrix = this pl other
public fun ShortMatrix.plus(other: ByteImageMatrix): ShortImageMatrix = this pl other
public fun ByteMatrix.plus(other: ShortMatrix): ShortMatrix = other pl this
public fun ByteMatrix.plus(other: ShortImageMatrix): ShortImageMatrix = other pl this
public fun ByteImageMatrix.plus(other: ShortMatrix): ShortImageMatrix = other pl this
