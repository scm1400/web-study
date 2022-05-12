package _3_FunctionalProgramming

// 함수형 타입의 구체적인 값을 만드는 방법?
// 함수를 묘사하되 이름을 지정하지 않는 람다식을 사용할 수 있다.

// { result, op -> result + op } 라는 식을 람다식이라고 부른다.
fun sum2(numbers: IntArray) =
    aggregate(numbers, { result, op -> result + op })

fun max2(numbers: IntArray) =
    aggregate(numbers, { result, op -> if (op > result) op else result })

// 람다에 인자가 없으면 화살표 기호 '->'를 생략할 수 있다.
fun measureTime3(action: () -> Unit):Long{
    val start = System.nanoTime()
    action()
    return System.nanoTime() - start
}

fun check(s: String, condition: (Char) -> Boolean): Boolean {
    for (c in s){
        if (!condition(c)) return false
    }
    return true
}

fun check2(s: String, condition: (Int, Char) -> Boolean): Boolean {
    for (i in s.indices){
        if (!condition(i,s[i])) return false
    }
    return true
}

fun forEach(a: IntArray, action: (Int) -> Unit){
    for (n in a){
        action(n)
    }
}

fun main() {
    println(check("Hello"){ c -> c.isLetter() })
    // 람다 인자가 하나인 경우에는 파라미터 목록과 화살표를 생략하고 it라는 이름을 사용해 가리킬 수 있다.
    println(check("Hello") { it.isLetter() })

    // 파라미터 목록에서 사용하지 않는 람다 파라미터를 밑줄 기호 '_'로 지정할 수 있다.
    println(check2("Hello") {_, c -> c.isLetter()})
    println(check2("Hello") {i, c -> i == 0 || c.isLetter()})

    var sum = 0
    // 외부 선언에 정의된 변수에 접근 할 수 있으며, 변경할 수 있다.
    // 자바 람다는 외부 변수의 값을 변경할 수 없다.
    forEach(intArrayOf(1,2,3,4)){
        sum += it
    }
    println(sum)
}

// sum_1은 람다를 이용한 방식, sum_2는 익명 함수를 이용한 방식이다
fun sum_1(numbers: IntArray) = aggregate(numbers) {result, op -> result + op}
fun sum_2(numbers: IntArray) = aggregate(numbers, fun(result, op) = result + op) // 익명함수이기 떄문에 fun 다음 바로 파라미터 목록이 온다.
                                                                                 // 람다와 마찬가지로 파라미터 타입을 지정하지 않아도 된다.(추론)

// 람다와 달리 익명함수에서는 반환 타입을 적을 수 있다.
fun sum_3(numbers: IntArray) = aggregate(numbers, fun(result, op): Int = result + op) // 함수 본문이 식인 경우 반환타입을 생략해도 되고 써도 된다.
fun sum_4(numbers: IntArray) = aggregate(numbers, fun(result, op): Int { return result + op}) // 함수 본문이 블록인 경우, 반환타입이 Unit이 아닌경우 반환 타입을 꼭 지정해야하며, return을 써야한다.

