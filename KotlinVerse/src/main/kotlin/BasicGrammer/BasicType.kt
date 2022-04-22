package BasicGrammer

fun main() {

    /** 정수 타입
     * Byte -128 ~ 127
     * Short -32768 ~ 32767
     * Int -2^31 ~ 2^31-1
     * Long -2^63 ~ 2^63-1
     */
    println(Byte.MAX_VALUE)
    println(Short.MAX_VALUE)
    println(Int.MAX_VALUE)
    println(Long.MAX_VALUE)

    // 큰 수를 표현할때 _ 를 넣을 수 있다.
    val n = 34_821_189

    // 리터럴에 L을 붙이면 Long 타입이 된다.
    val hundredLong = 100L

    // 0b를 붙이면 2진수, 0x를 붙이면 16진수
    // 8진수는 지원하지 않음음
    val bin = 0b10101 //21
    val hex = 0xf9 //249

    //과학적 표기법(scientific notation) 허용
    val pi = 0.314E1 // 3.14
    val pi100 = 0.314E3 // 314.0
    val thousand = 1E3 // 1000.0

    //부동소수점 리터럴 타입은 디폴트로 Double 이다
    val p = 3.14
    println(p.javaClass) // double
    // f를 붙이면 Float 타입이 된다.
    val float = 3.14f
    println(float.javaClass) // float

    println(Float.MIN_VALUE) // 1.4E-45
    println(Double.MAX_VALUE) // 1.7976931348623157E308
    println(Double.POSITIVE_INFINITY) // 무한대
    println(1.0/Double.NEGATIVE_INFINITY) // -0.0
    println(2 - Double.POSITIVE_INFINITY) // -무한대
    println(3 * Float.NaN) // NaN : 0/0 같은 숫자가 아닌 값

    println((-4) % 3) // -1
    println((-4).mod(3)) // 2

    println((-7).floorDiv(4)) // -2
    println((-7)/4) // -1


}