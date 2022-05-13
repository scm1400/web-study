package _3_FunctionalProgramming

// 고차 함수와 함숫값을 사용하면 함수가 객체로 표현되기 때문에 성능 차원에서 부가 비용이 발생한다.
// 코틀린은 함숫값을 사용할 때 발생하는 런타임 비용을 줄일 수 있는 해법을 제공한다.

// 인라인 기법 : 함숫값을 사용하는 고차 함수를 호출하는 부분을 해당 함수의 본문으로 대체
// 인라인이 될 수 있는 함수를 구별하기 위해 inline 변경자를 함수 앞에 붙여야한다.
inline fun indexOf(numbers: IntArray, condition: (Int) -> Boolean): Int {
    for (i in numbers.indices){
        if (condition(numbers[i])) return i
    }
    return -1
}

var lastAction: () -> Unit = {}
inline fun runAndMemorize(action: () -> Unit) {
    action()
    // 인라인 함수가 아닌 함수에 전달될 수 없다.
    // lastAction = action  => 오류
}

/* 인라인 함수는 널이 될 수 있는 함수 타입의 인자를 받을 수 없다.
inline fun forEach2(a: IntArray, action: ((Int) -> Unit)?){ => 오류
    if (action == null) return
    for (n in a){
        action(n)
    }
}
 이런 경우 특정 람다를 인라인하지 말라고 noinline 변경자를 붙일 수 있다. */
inline fun forEach2(a: IntArray, noinline action: ((Int) -> Unit)?){
    if (action == null) return
    for (n in a){
        action(n)
    }
}

class Person2(private val firstName: String, private val familyName: String){
    inline fun sendMessage(message: () -> String){
        // inline 함수에 private 멤버를 전달 할 수 없다 : 인라인 함수의 본문이 호출 지점을 대신하게 되어 외부에서 캡슐화를 깰 수 있게 되기 때문에 금지
        // println("$firstName $familyName: ${message()}") => 오류
    }
}

class Person3(var firstName: String, var familyName: String){
    // var 앞에 inline을 붙이면 get, set을 모두 인라인해준다.\
    // 프로퍼티 접근자(get,set)를 인라인하도록 하면 함수 호출을 없애기 때문에 프로퍼티를 읽고 쓰는 성능을 향상 시킬 수 있다.
    // inline 프로퍼티는 backing field를 가질 수 없으므로, field 키워드를 사용할 수 없다.
    inline var fullName
        get() = "$firstName $familyName" // 만약, firstName이 private 멤버면 접근 할 수 없다
        set(value) {
        }
}

fun main() {
    println(indexOf(intArrayOf(4, 3, 2, 1)) {it < 3})
    println(indexOf(intArrayOf(4, 3, 2, 1)) { i -> i < 3})

    /* 지역 함수에 inline을 사용할 수 없다
    inline fun runAndMemorize(action: () -> Unit) {
        action()
        lastAction = action
    }
     */
}

/* inline 기법을 쓰면 위의 main() 함 수가 다음 코드와 같이 번역된다.
 * 컴파일된 코드의 크기는 커지지만, 지혜롭게 사용하면 성능을 크게 높일 수 있다.
fun main() {
    val numbers = intArrayOf(4, 3, 2, 1)
    var index = -1

    for (i in numbers.indices) {
        if (numbers[i] < 3) {
            index = i
            break
        }
    }
    println(index)
}
 */