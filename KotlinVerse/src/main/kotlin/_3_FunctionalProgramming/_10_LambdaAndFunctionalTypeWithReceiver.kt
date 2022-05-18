package _3_FunctionalProgramming

import java.lang.IllegalArgumentException

/** [ 람다와 수신 객체 지정 함수 타입 ]
 * 함수나 프로퍼티와 마찬가지로 람다나 익명 함수에 대해서도 확장 수신 객체를 활용할 수 있다.
 * 이런 함숫값들은 수신 객체 지정 함수 타입(Functional Type With Receiver)라는 특별한 타입으로 표현된다.
 */

// ' Int.(Int) -> Int ' 이렇게 정의한 경우 함수에 전달된 람다는 암시적으로 수신 객체를 가진다.
fun aggregate2(numbers: IntArray, op: Int.(Int) -> Int): Int {
    var result = numbers.firstOrNull()
        ?: throw IllegalArgumentException("Empty array")

    for (i in 1..numbers.lastIndex) result = result.op(numbers[i]) // result가 Int 타입이므로 수신 객체

    return result
}

fun sum3(numbers: IntArray) = aggregate2(numbers) { op -> this + op } // this를 사용해 수신 객체에 접근할 수 있따.

// 익명 함수에 대해서도 확장 함수 문법을 사용할 수 있다.
fun sum4(numbers: IntArray) = aggregate2(numbers, fun Int.(op: Int) = this + op)

// 확장 함수가 아닌 일반 함수 형태로 호출할 수도 있다.
fun aggregate3(numbers: IntArray, op: Int.(Int) -> Int): Int {
    var result = numbers.firstOrNull()
        ?: throw IllegalArgumentException("Empty array")

    for (i in 1..numbers.lastIndex) result = op(result, numbers[i]) // 비확장 함수 호출

    return result
}

// 리터럴이 아닌 함숫값은 자유롭게 수신 객체가 있는 함수 타입 값과
// 수신 객체가 첫 번째 파라미터인 일반 함수 타입 값의 역할을 할 수 있다.
// 이 두 타입의 값이 런타임에는 똑같이 표현되기 때문이다.
val min1: Int.(Int) -> Int = { if (this < it) this else it }
val min2: (Int, Int) -> Int = min1 // 수신 객체가 첫 번째 파라미터인 일반 함수 타입
val min3: Int.(Int) -> Int = min2 // 수신 객체가 있는 함수 타입

fun main() {
    // 수신 객체가 있는 함숫값은 확장 형태나 비확장 형태 모두 호출 할 수 있지만,
    // 수신 객체가 없는 함수값은 비확장 형태로만 호출할 수 있다.
    println((5).min1(4)) // min1을 확장 함수로 호출
    println(min1(5,4)) // min1을 비확장 함수로 호출
}