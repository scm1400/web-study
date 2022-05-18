package _3_FunctionalProgramming

// 수신 객체가 있는 함숫값을 정의하는 호출 가능 참조를 만들 수 있다.
// 문법적으로 바인딩된 호출 가능 참조와 비슷하지만, 수신 객체를 계산하는 식 대신 수식 객체 타입이 앞에 붙는다는 점이 다르다

fun aggregate4(numbers: IntArray, op: Int.(Int) -> Int): Int {
    var result = numbers.firstOrNull()
        ?: throw IllegalArgumentException("Empty Array")

    for (i in 1..numbers.lastIndex) result = result.op(numbers[i])

    return result
}

fun Int.max(other: Int) = if (this > other) this else other

fun max2(a: Int, b: Int) = if (a > b) a else b

fun main() {
    val numbers = intArrayOf(1, 2, 3, 4)
    println(aggregate4(numbers, Int::plus)) // Int 내장 클래스의 plus() 멤버 함수를 사용
    println(aggregate4(numbers, Int::max)) // 위에서 정의한 max() 함수를 사용
                                           // 두 경우 모두 똑같은 구문을 사용한다

    println(aggregate4(numbers, ::max2)) // 수신 객체가 첫번째 파라미터 역할을 하므로, 인자가 두개인 ::max2를 전달해도 된다.

//    println(aggregate4(numbers, test2::max4)) // 에러
    println(aggregate4(numbers, test2.max4)) // 정상
}

// 클래스 멤버인 동시에 확장 함수로 정의된 함수에 대한 호출 가능 참조는 지원하지 않는다.
// 이런 함수의 경우 '::함수 이름' 형태로는 여러 수신 객체 타입을 지정할 방법이 없기 때문이다.
class test{
    val max3: Int.(Int) -> Int = {n -> if (n > this) n else this }
}

object test2{
    val max4: Int.(Int) -> Int = {n -> if (n > this) n else this }
}
