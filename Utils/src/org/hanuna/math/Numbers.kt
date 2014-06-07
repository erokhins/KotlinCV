package org.hanuna.math


public trait NumberOperation<X, Y, R> {
    public fun X.plus(other: Y): R
    public fun X.minus(other: Y): R
    public fun X.times(other: Y): R
}

public trait AbsorbentNumberOperation<X, Y> : NumberOperation<X, Y, X>

public trait AbsorbentWithNumbers<X> {
    val withDouble: AbsorbentNumberOperation<X, Double>
    val withFloat: AbsorbentNumberOperation<X, Float>
    val withLong: AbsorbentNumberOperation<X, Long>

    val withInt: AbsorbentNumberOperation<X, Int>
    val withShort: AbsorbentNumberOperation<X, Short>
    val withByte: AbsorbentNumberOperation<X, Byte>
}

public fun <X, Y: Number> AbsorbentWithNumbers<X>.getAbsorbentNumberOperation(n: Y): AbsorbentNumberOperation<X, Y> {
    if (n.javaClass == javaClass<Int>()) {}
    val ano: AbsorbentNumberOperation<X, *> =
            when (n.javaClass) {
                javaClass<Double>() -> this.withDouble
                javaClass<Float>() -> this.withFloat
                javaClass<Long>() -> this.withLong
                javaClass<Int>() -> this.withInt
                javaClass<Short>() -> this.withShort
                javaClass<Byte>() -> this.withByte
                else -> throw IllegalStateException("class not supported: ${n.javaClass}")
            }
    return ano as AbsorbentNumberOperation<X, Y>
}

public fun <X: Number, Y: Number> X.getAbsorbentNumberOperation(n: Y): AbsorbentNumberOperation<X, Y> {
    val awn: AbsorbentWithNumbers<*> =
            when(this.javaClass) {
                javaClass<Double>() -> DoubleWithNO
                javaClass<Float>() -> FloatWithNO
                javaClass<Long>() -> LongWithNO
                javaClass<Int>() -> IntWithNO
                javaClass<Short>() -> ShortWithNO
                javaClass<Byte>() -> ByteWithNO
                else -> throw IllegalStateException("class not supported: ${this.javaClass}")
            }
    val awnCast = awn as AbsorbentWithNumbers<Number>
    return awnCast.getAbsorbentNumberOperation(n) as AbsorbentNumberOperation<X, Y>
}
