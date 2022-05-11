package _1_BasicGrammer

fun main() {

    // 이 함수를
    fun max(a: Int, b: Int): Int {
        if (a > b) return a
        else return b
    }

    // 이렇게 단순화 할 수 있다 ( 자바와의 차이점 )
    // IF 문을 아래처럼 식으로 사용할 때는 if, else 양 가지가 모두 있어야한다.
    // 자바에 있는 3항 연산자가 없다. 하지만 if를 식으로 쓸 수 있기 때문에 대부분 상쇄된다.
    fun max2(a: Int, b: Int) = if (a > b) a else b
    val a = 1;
    val b = 2
    val max = if (a > b) a else b

    // 수열(Interval)을 표현하는 타입
    // Range : 시작과 끝 값이 포함됨
    val chars = 'a'..'h' // 'a' 부터 'h'까지 모든 문자
    val towDigits = 10..99 // 10부터 99까지 모든 수

    // until : 끝값은 포함되지 않음
    val twoDigits2 = 10 until 100 // 10부터 99까지지

    // 반대로 내려가는 range
    val twoDigits3 = 100 downTo 10 // 100 ~ 10

    // 수열의 간격을 지정할 수도 있다 (간격은 양수)
    println(1..10 step 3) // 1 4 7 10
    println(15 downTo 9 step 2) // 15 13 11 9

    // in : 어떤 값이 범위 안에 들어있는지 알 수 있음
    // !in 도 사용가능
    val num = 22
    println(num in 10..99)

    // range를 문자열에 사용하는 경우
    println("Hello!".substring(1..4)) //ello
    println("Hello!".substring(1 until 4)) //ell

    // When 문 :
    // 자바의 switch 문과 비슷하지만 when에서는 임의의 조건을 검사할 수 있고 switch문은 주어진 식의 여러가지 값 중 하나만 선택 할 수 있다.
    fun hexDigit(n: Int): Char {
        when {
            n in 0..9 -> return '0' + n
            n in 10..15 -> return 'A' + n - 10
            else -> return '?'
        }
    }
    // 상수가 아닌 임의의 식을 사용해도 된다, 변수는 블록 내부에서만 사용할 수 있고 var로 선언할 수는 없다
    fun readHexDigit() = when (val n = readLine()!!.toInt()) {
        in 0..9 -> '0' + n
        in 10..15 -> 'A' + n -10
        else -> '?'
    }


}
