package _2_ClassAndObject

// 일반적으로 널이 될 수 있는 값을 사용하려면 예외를 던지는 방식보다
// 더 타당한 응답을 제공해야 하기 때문에 이 연산자를 사용하지 말아야 한다.
val n = readLine()!!.toInt()

fun main() {
    var name: String? = null

    fun initialize() {
        name = "Earl"
    }

    fun sayHello() {
        println(name!!.uppercase())
    }
// 이름에 null이 될 수 없는 값이 할당된 다음에 sayHello() 함수가 호출
// 컴파일러는 안전하다고 인식할 수 없기 때문에 !!를 적어야 경고를 무시할 수 있다.
    initialize()
    sayHello()
}