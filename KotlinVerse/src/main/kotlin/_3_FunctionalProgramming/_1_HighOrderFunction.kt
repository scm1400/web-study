package _3_FunctionalProgramming

fun sumArray(numbers: IntArray):Int{
    var result = numbers.firstOrNull()
        ?: throw IllegalArgumentException("Empty array")

    for (i in 1..numbers.lastIndex) result += numbers[i]

    return result
}
// 위 함수에서 함수 자체의 기본적인 루프 로직은 그대로 두고 중간 값들을 함수 파라미터로 추출한 다음,
// 일반화한 함수를 호출할 때 이 파라이머테 적당한 연산을 제공하여 아래와 같은 함수로 바꾸면 된다.
fun aggregate(numbers: IntArray, op: (Int, Int) -> Int): Int {
    var result = numbers.firstOrNull()
        ?: throw IllegalArgumentException("Empty array")

    for (i in 1..numbers.lastIndex) result = op(result, numbers[i])

    return result
}

// result와 op는 함수 파라미터 역할을 하며, '->' 다음에 오는 식은 결과를 계산하는 식이다. 이 경우 명시적인 return이 불필요하다.
fun sum(numbers: IntArray) =
    aggregate(numbers) { result, op -> result + op }

fun max(numbers: IntArray) =
    aggregate(numbers) { result, op -> if (op > result) op else result }

fun main() {
    println(sum(intArrayOf(1,2,3)))
}