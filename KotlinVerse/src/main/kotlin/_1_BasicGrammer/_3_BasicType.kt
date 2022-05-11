package _1_BasicGrammer

import kotlin.io.println as println

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
    println(1.0 / Double.NEGATIVE_INFINITY) // -0.0
    println(2 - Double.POSITIVE_INFINITY) // -무한대
    println(3 * Float.NaN) // NaN : 0/0 같은 숫자가 아닌 값

    println((-4) % 3) // -1
    println((-4).mod(3)) // 2

    println((-7).floorDiv(4)) // -2
    println((-7) / 4) // -1

    // 비트연산
    // 자바와 달리 & | ^ ~ << >> >>>>를 지원하지 않음
    println("왼쪽 시프트: " + (13 shl 2)) // 52
    println("오른쪽 시프트: " + (13 shr 2)) // 3
    println("부호 없는 오른쪽 시프트: " + (13 ushr 2)) // 3
    println("비트 반전: " + (13.inv())) // -14
    // and, or, xor도 있음

    //Char - 유니코드 한 글자 표현, 16비트
    //val z = 'z'
    //escape 문자: \t(tab) \b(backspace) \n(newline) \'(작은따옴표) \"(큰따옴표) \\(역슬래시) \$(달러표시)
    // \r(carriage return: 맨 앞으로 이동)  \u03c0 16진수로 유니코드 표현

    //수 변환
    val num = 100
    val l:Long = num.toLong() // Long 타입에 Int 를 대입 할 수 없음

    //큰 타입에서 작은 타입으로 변환 하는경우 2진수로 표현했을 때 상위비트 쪽을 잘라내고 값으로 변환한다.
    //Long -> Float으로 변환하면 2진수로 표현했을 때 하위 비트 쪽을 잃어버릴 수 있다.
    val num2 = 945;
    println(num2.toByte()) //-79
    println(num2.toShort()) // 945
    println(num2.toChar()) // a
    println(num2.toLong()) // 945
    println(2.5.toInt()) // 2
    println((-2.5).toInt()) // -2
    println((1_000_000_000_000).toFloat().toLong()) // 999999995904

    // &&, || 지연 계산
    // 아래 두 경우에서, 지연 계산을 하기 때문에 왼쪽이 True이면 오른쪽을 계산하지 않는다
    // x가 1인 경우에 지연연산이 아니면 아래 식은 (x-1) 부분에서 오류가 발생한다
    fun 지연계산(x:Int, y:Int){
        println(x == 1 || y/(x-1) != 1)
        println(x != 1 && y/(x-1) != 1)
    }
    지연계산(1,2)

    // 비교 ==, =!,
    val a = 1
    val b = 2L
    //a == b // int와 Long에 == 비교할 수 없음 // < > <= >= 비교는 가능하다
    //'a' > 0 // int와 char은 비교 할 수 없음

    var set = sortedSetOf(Double.NaN, Double.NaN, Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY, 0.0)
    // -> [-infinity, 0.0, infinity, NaN] //NaN은 Double에서 가장 큰 값으로 취급된다. 무한대보다도 큼

}