package _3_FunctionalProgramming

// IntRange 클래스의 동반 객체에 대한 확장 함수 정의
fun IntRange.Companion.singletonRange(n: Int) = n..n

// String 클래스의 동반 객체에 대한 확장 프로퍼티 정의
val String.Companion.HELLO
    get() = "Hello"

// 클래스에 동반 객체가 존재하는 경우에만 동반 객체에 대한 확장을 정의할 수 있다.
class Person5(val firstNAme: String, val familyName: String){
    companion object // 확장 정의를 위해 내용이 없는 동반 객체를 정의함
}

val Person5.Companion.UNKNOWN by lazy { Person5("Earl","Gray") }

// fun Any.Companion.sayHello() = println("Hello") => Any 클래스에는 동반 객체가 없으므로 동반 객체에 대한 확장을 정의할 수 없다.

fun main() {
    // 함수에 접근할 때는 클래스의 이름을 사용한다.
    println(IntRange.singletonRange(5))
    // Companion을 붙여도 된다.
    println(String.Companion.HELLO)
}
