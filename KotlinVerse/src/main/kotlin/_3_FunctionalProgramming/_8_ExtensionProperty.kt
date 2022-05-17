package _3_FunctionalProgramming

// 확장 프로퍼티 정의에서는 항상 명시적인 게터를 정의해야 한다.
val IntRange.leftHalf: IntRange // IntRange에 대go leftHalf 확장 프로퍼티 정의
    get() = start..(start + endInclusive)/2
val IntArray.midIndex
    get() = lastIndex/2

// 가변(var) 프로퍼티인 경우에는 세터도 명시해야만 한다.
var IntArray.midValue
    get() = this[midIndex]
    set(value) {
        this[midIndex] = value
    }

// 확장 프로퍼티는 어떤 클래스의 인스턴스에 안정적으로 상태를 추가할 방법이 없기 때문에 뒷받침 하는 필드를 쓸 수 없다.
// 이 말은 확장 프로퍼티를 초기화할 수도 없고, 접근자 안에서 field를 뒷받침하는 필드에 의존하는 기능이기 때문.사용할 수 없다는 뜻이다.
// lateinit으로 확장 프로퍼티를 정의할 수도 없다. lateinit은 뒷받침하는 필드에 의존하는 기능이기 때문이다.
fun main() {
    println((1..3).leftHalf) // 1..2
    println((3..6).leftHalf) // 3..4

    val numbers = IntArray(6) { it*it }
    println(numbers.midValue)
    numbers.midValue *= 10
    println(numbers.midValue)

    println("Hello".message) // => Hello 출력
    println("Bye".message) // => Hello 출력

    println(Messages.HELLO) // => Hello 출력
}


// 확장 프로퍼티에서도 위임을 사용할 수 있다.
// 다만 위임식이 프로퍼티의 수신 객체에 접근할 수 없다는 점에 유의하자.
// 따라서 일반적으로 다음과 같이 수신 객체 타입이 같으면 모두 똑같은 인스턴스를 얻기 때문에
// lazy 프로퍼티를 확장으로 선언해도 사용상 그다지 이점이 없다.
val String.message by lazy { "Hello" }

// 인스턴스가 단 하나만 있기 때문에 객체 정의는 예외다 ??
object Messages

val Messages.HELLO by lazy { "Hello" }