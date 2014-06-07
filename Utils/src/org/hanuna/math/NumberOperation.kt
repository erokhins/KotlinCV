package org.hanuna.math

// Double
public object DoubleDoubleNO : AbsorbentNumberOperation<Double, Double> {
    override fun Double.plus(other: Double): Double = this + other
    override fun Double.minus(other: Double): Double = this - other
    override fun Double.times(other: Double): Double = this * other
}
public object DoubleFloatNO : AbsorbentNumberOperation<Double, Float> {
    override fun Double.plus(other: Float): Double = this + other
    override fun Double.minus(other: Float): Double = this - other
    override fun Double.times(other: Float): Double = this * other
}
public object DoubleLongNO : AbsorbentNumberOperation<Double, Long> {
    override fun Double.plus(other: Long): Double = this + other
    override fun Double.minus(other: Long): Double = this - other
    override fun Double.times(other: Long): Double = this * other
}
public object DoubleIntNO : AbsorbentNumberOperation<Double, Int> {
    override fun Double.plus(other: Int): Double = this + other
    override fun Double.minus(other: Int): Double = this - other
    override fun Double.times(other: Int): Double = this * other
}
public object DoubleShortNO : AbsorbentNumberOperation<Double, Short> {
    override fun Double.plus(other: Short): Double = this + other
    override fun Double.minus(other: Short): Double = this - other
    override fun Double.times(other: Short): Double = this * other
}
public object DoubleByteNO : AbsorbentNumberOperation<Double, Byte> {
    override fun Double.plus(other: Byte): Double = this + other.to255Int()
    override fun Double.minus(other: Byte): Double = this - other.to255Int()
    override fun Double.times(other: Byte): Double = this * other.to255Int()
}

public object DoubleWithNO : DoubleWithNumbers

public trait DoubleWithNumbers : AbsorbentWithNumbers<Double> {
    override val withDouble: AbsorbentNumberOperation<Double, Double>
        get() = DoubleDoubleNO
    override val withFloat: AbsorbentNumberOperation<Double, Float>
        get() = DoubleFloatNO
    override val withLong: AbsorbentNumberOperation<Double, Long>
        get() = DoubleLongNO
    override val withInt: AbsorbentNumberOperation<Double, Int>
        get() = DoubleIntNO
    override val withShort: AbsorbentNumberOperation<Double, Short>
        get() = DoubleShortNO
    override val withByte: AbsorbentNumberOperation<Double, Byte>
        get() = DoubleByteNO
}


// Float
public object FloatDoubleNO : AbsorbentNumberOperation<Float, Double> {
    override fun Float.plus(other: Double): Float = (this + other).toFloat()
    override fun Float.minus(other: Double): Float = (this - other).toFloat()
    override fun Float.times(other: Double): Float = (this * other).toFloat()
}
public object FloatFloatNO : AbsorbentNumberOperation<Float, Float> {
    override fun Float.plus(other: Float): Float = this + other
    override fun Float.minus(other: Float): Float = this - other
    override fun Float.times(other: Float): Float = this * other
}
public object FloatLongNO : AbsorbentNumberOperation<Float, Long> {
    override fun Float.plus(other: Long): Float = this + other
    override fun Float.minus(other: Long): Float = this - other
    override fun Float.times(other: Long): Float = this * other
}
public object FloatIntNO : AbsorbentNumberOperation<Float, Int> {
    override fun Float.plus(other: Int): Float = this + other
    override fun Float.minus(other: Int): Float = this - other
    override fun Float.times(other: Int): Float = this * other
}
public object FloatShortNO : AbsorbentNumberOperation<Float, Short> {
    override fun Float.plus(other: Short): Float = this + other
    override fun Float.minus(other: Short): Float = this - other
    override fun Float.times(other: Short): Float = this * other
}
public object FloatByteNO : AbsorbentNumberOperation<Float, Byte> {
    override fun Float.plus(other: Byte): Float = this + other.to255Int()
    override fun Float.minus(other: Byte): Float = this - other.to255Int()
    override fun Float.times(other: Byte): Float = this * other.to255Int()
}

public object FloatWithNO : FloatWithNumbers

public trait FloatWithNumbers : AbsorbentWithNumbers<Float> {
    override val withDouble: AbsorbentNumberOperation<Float, Double>
        get() = FloatDoubleNO
    override val withFloat: AbsorbentNumberOperation<Float, Float>
        get() = FloatFloatNO
    override val withLong: AbsorbentNumberOperation<Float, Long>
        get() = FloatLongNO
    override val withInt: AbsorbentNumberOperation<Float, Int>
        get() = FloatIntNO
    override val withShort: AbsorbentNumberOperation<Float, Short>
        get() = FloatShortNO
    override val withByte: AbsorbentNumberOperation<Float, Byte>
        get() = FloatByteNO
}


// Long
public object LongDoubleNO : AbsorbentNumberOperation<Long, Double> {
    override fun Long.plus(other: Double): Long = (this + other).toLong()
    override fun Long.minus(other: Double): Long = (this - other).toLong()
    override fun Long.times(other: Double): Long = (this * other).toLong()
}
public object LongFloatNO : AbsorbentNumberOperation<Long, Float> {
    override fun Long.plus(other: Float): Long = (this + other).toLong()
    override fun Long.minus(other: Float): Long = (this - other).toLong()
    override fun Long.times(other: Float): Long = (this * other).toLong()
}
public object LongLongNO : AbsorbentNumberOperation<Long, Long> {
    override fun Long.plus(other: Long): Long = this + other
    override fun Long.minus(other: Long): Long = this - other
    override fun Long.times(other: Long): Long = this * other
}
public object LongIntNO : AbsorbentNumberOperation<Long, Int> {
    override fun Long.plus(other: Int): Long = this + other
    override fun Long.minus(other: Int): Long = this - other
    override fun Long.times(other: Int): Long = this * other
}
public object LongShortNO : AbsorbentNumberOperation<Long, Short> {
    override fun Long.plus(other: Short): Long = this + other
    override fun Long.minus(other: Short): Long = this - other
    override fun Long.times(other: Short): Long = this * other
}
public object LongByteNO : AbsorbentNumberOperation<Long, Byte> {
    override fun Long.plus(other: Byte): Long = this + other.to255Int()
    override fun Long.minus(other: Byte): Long = this - other.to255Int()
    override fun Long.times(other: Byte): Long = this * other.to255Int()
}

public object LongWithNO : LongWithNumbers

public trait LongWithNumbers : AbsorbentWithNumbers<Long> {
    override val withDouble: AbsorbentNumberOperation<Long, Double>
        get() = LongDoubleNO
    override val withFloat: AbsorbentNumberOperation<Long, Float>
        get() = LongFloatNO
    override val withLong: AbsorbentNumberOperation<Long, Long>
        get() = LongLongNO
    override val withInt: AbsorbentNumberOperation<Long, Int>
        get() = LongIntNO
    override val withShort: AbsorbentNumberOperation<Long, Short>
        get() = LongShortNO
    override val withByte: AbsorbentNumberOperation<Long, Byte>
        get() = LongByteNO
}


// Int
public object IntDoubleNO : AbsorbentNumberOperation<Int, Double> {
    override fun Int.plus(other: Double): Int = (this + other).toInt()
    override fun Int.minus(other: Double): Int = (this - other).toInt()
    override fun Int.times(other: Double): Int = (this * other).toInt()
}
public object IntFloatNO : AbsorbentNumberOperation<Int, Float> {
    override fun Int.plus(other: Float): Int = (this + other).toInt()
    override fun Int.minus(other: Float): Int = (this - other).toInt()
    override fun Int.times(other: Float): Int = (this * other).toInt()
}
public object IntLongNO : AbsorbentNumberOperation<Int, Long> {
    override fun Int.plus(other: Long): Int = (this + other).toInt()
    override fun Int.minus(other: Long): Int = (this - other).toInt()
    override fun Int.times(other: Long): Int = (this * other).toInt()
}
public object IntIntNO : AbsorbentNumberOperation<Int, Int> {
    override fun Int.plus(other: Int): Int = this + other
    override fun Int.minus(other: Int): Int = this - other
    override fun Int.times(other: Int): Int = this * other
}
public object IntShortNO : AbsorbentNumberOperation<Int, Short> {
    override fun Int.plus(other: Short): Int = this + other
    override fun Int.minus(other: Short): Int = this - other
    override fun Int.times(other: Short): Int = this * other
}
public object IntByteNO : AbsorbentNumberOperation<Int, Byte> {
    override fun Int.plus(other: Byte): Int = this + other.to255Int()
    override fun Int.minus(other: Byte): Int = this - other.to255Int()
    override fun Int.times(other: Byte): Int = this * other.to255Int()
}

public object IntWithNO : IntWithNumbers

public trait IntWithNumbers : AbsorbentWithNumbers<Int> {
    override val withDouble: AbsorbentNumberOperation<Int, Double>
        get() = IntDoubleNO
    override val withFloat: AbsorbentNumberOperation<Int, Float>
        get() = IntFloatNO
    override val withLong: AbsorbentNumberOperation<Int, Long>
        get() = IntLongNO
    override val withInt: AbsorbentNumberOperation<Int, Int>
        get() = IntIntNO
    override val withShort: AbsorbentNumberOperation<Int, Short>
        get() = IntShortNO
    override val withByte: AbsorbentNumberOperation<Int, Byte>
        get() = IntByteNO
}


// Short
public object ShortDoubleNO : AbsorbentNumberOperation<Short, Double> {
    override fun Short.plus(other: Double): Short = (this + other).toShort()
    override fun Short.minus(other: Double): Short = (this - other).toShort()
    override fun Short.times(other: Double): Short = (this * other).toShort()
}
public object ShortFloatNO : AbsorbentNumberOperation<Short, Float> {
    override fun Short.plus(other: Float): Short = (this + other).toShort()
    override fun Short.minus(other: Float): Short = (this - other).toShort()
    override fun Short.times(other: Float): Short = (this * other).toShort()
}
public object ShortLongNO : AbsorbentNumberOperation<Short, Long> {
    override fun Short.plus(other: Long): Short = (this + other).toShort()
    override fun Short.minus(other: Long): Short = (this - other).toShort()
    override fun Short.times(other: Long): Short = (this * other).toShort()
}
public object ShortIntNO : AbsorbentNumberOperation<Short, Int> {
    override fun Short.plus(other: Int): Short = (this + other).toShort()
    override fun Short.minus(other: Int): Short = (this - other).toShort()
    override fun Short.times(other: Int): Short = (this * other).toShort()
}
public object ShortShortNO : AbsorbentNumberOperation<Short, Short> {
    override fun Short.plus(other: Short): Short = (this + other).toShort()
    override fun Short.minus(other: Short): Short = (this - other).toShort()
    override fun Short.times(other: Short): Short = (this * other).toShort()
}
public object ShortByteNO : AbsorbentNumberOperation<Short, Byte> {
    override fun Short.plus(other: Byte): Short = (this + other.to255Int()).toShort()
    override fun Short.minus(other: Byte): Short = (this - other.to255Int()).toShort()
    override fun Short.times(other: Byte): Short = (this * other.to255Int()).toShort()
}

public object ShortWithNO : ShortWithNumbers

public trait ShortWithNumbers : AbsorbentWithNumbers<Short> {
    override val withDouble: AbsorbentNumberOperation<Short, Double>
        get() = ShortDoubleNO
    override val withFloat: AbsorbentNumberOperation<Short, Float>
        get() = ShortFloatNO
    override val withLong: AbsorbentNumberOperation<Short, Long>
        get() = ShortLongNO
    override val withInt: AbsorbentNumberOperation<Short, Int>
        get() = ShortIntNO
    override val withShort: AbsorbentNumberOperation<Short, Short>
        get() = ShortShortNO
    override val withByte: AbsorbentNumberOperation<Short, Byte>
        get() = ShortByteNO
}


// Byte
public object ByteDoubleNO : AbsorbentNumberOperation<Byte, Double> {
    override fun Byte.plus(other: Double): Byte = (this.to255Int() + other).toByte()
    override fun Byte.minus(other: Double): Byte = (this.to255Int() - other).toByte()
    override fun Byte.times(other: Double): Byte = (this.to255Int() * other).toByte()
}
public object ByteFloatNO : AbsorbentNumberOperation<Byte, Float> {
    override fun Byte.plus(other: Float): Byte = (this.to255Int() + other).toByte()
    override fun Byte.minus(other: Float): Byte = (this.to255Int() - other).toByte()
    override fun Byte.times(other: Float): Byte = (this.to255Int() * other).toByte()
}
public object ByteLongNO : AbsorbentNumberOperation<Byte, Long> {
    override fun Byte.plus(other: Long): Byte = (this.to255Int() + other).toByte()
    override fun Byte.minus(other: Long): Byte = (this.to255Int() - other).toByte()
    override fun Byte.times(other: Long): Byte = (this.to255Int() * other).toByte()
}
public object ByteIntNO : AbsorbentNumberOperation<Byte, Int> {
    override fun Byte.plus(other: Int): Byte = (this.to255Int() + other).toByte()
    override fun Byte.minus(other: Int): Byte = (this.to255Int() - other).toByte()
    override fun Byte.times(other: Int): Byte = (this.to255Int() * other).toByte()
}
public object ByteShortNO : AbsorbentNumberOperation<Byte, Short> {
    override fun Byte.plus(other: Short): Byte = (this.to255Int() + other).toByte()
    override fun Byte.minus(other: Short): Byte = (this.to255Int() - other).toByte()
    override fun Byte.times(other: Short): Byte = (this.to255Int() * other).toByte()
}
public object ByteByteNO : AbsorbentNumberOperation<Byte, Byte> {
    override fun Byte.plus(other: Byte): Byte = (this.to255Int() + other.to255Int()).toByte()
    override fun Byte.minus(other: Byte): Byte = (this.to255Int() - other.to255Int()).toByte()
    override fun Byte.times(other: Byte): Byte = (this.to255Int() * other.to255Int()).toByte()
}

public object ByteWithNO : ByteWithNumbers

public trait ByteWithNumbers : AbsorbentWithNumbers<Byte> {
    override val withDouble: AbsorbentNumberOperation<Byte, Double>
        get() = ByteDoubleNO
    override val withFloat: AbsorbentNumberOperation<Byte, Float>
        get() = ByteFloatNO
    override val withLong: AbsorbentNumberOperation<Byte, Long>
        get() = ByteLongNO
    override val withInt: AbsorbentNumberOperation<Byte, Int>
        get() = ByteIntNO
    override val withShort: AbsorbentNumberOperation<Byte, Short>
        get() = ByteShortNO
    override val withByte: AbsorbentNumberOperation<Byte, Byte>
        get() = ByteByteNO
}