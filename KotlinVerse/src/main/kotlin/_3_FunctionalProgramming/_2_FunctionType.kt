package _3_FunctionalProgramming

// 함수 타입은 함수처럼 쓰일 수 있는 값들을 표시하는 타입이다. 다음과 같이 두 가지 부분으로 구성된다.
// 1. 괄호로 둘러싸인 파라미터 타입 목록은 함숫값에 전달될 데이터의 종류와 수를 정의한다.
// 2. 반환 타입은 함수 타입의 함숫값을 호출하면 돌려받게 되는 값의 타입을 정의한다.
// 반환값이 없는 함수라도 함수 타입에는 반환 타입을 반드시 명시해야한다. 이런 경우 Unit을 반환 타입으로 사용한다.

// (Int, Int) -> Boolean
// => 함수 정의에서와 달리 함수 타입 표기에서는 인자 타입 목록과 반환 타입 사이를 ':'이 아닌 '->'로 구분한다.

// 함수 타입인 값도 op(result, numbers[i])와 같이 일반 함수처럼 호출할 수 있다.
// 함숫값을 호출 하는 다른 방법은 invoke() 메서드를 사용하는 것이다.
// => result = op.invoke(result, numbers[i])


// 함수가 인자를 받지 않는 경우에는 함수 타입의 파라미터 목록에 빈 괄호를 사용한다
fun measureTime(action: () -> Unit):Long{
    val start = System.nanoTime()
    action()
    return System.nanoTime() - start
}

// 코틀린 1.4부터는 코틀린 인터페이스 앞에 fun을 붙이면 코틀린 인터페이스를 SAM 인터페이스로 취급한다.
// SAM Interface : 추상 메소드가 한개 있는 인터페이스
fun interface StringConsumer {
    fun accept(s:String)
}

fun main() {
    val consume = StringConsumer { s -> println(s)}
    consume.accept("Hello")
    println(measureTime { println("Hello") })
    println(inc(1))

    // 함수 타입을 다른 함수 타입 안에 내포시켜서 고차 함수의 타입을 정의할 수 있다.
    // 아래 타입은 Int 값을 인자로 받아서 함수를 반환하는 함수이다.
    val shifter: (Int) -> ((Int) -> Int) = {n -> { i -> i + n }}
    val inc = shifter(1)
    val dec = shifter(-1)
    println(inc(10)) // 11

    // Int를 받아서 Int를 내놓은 함수를 인자로 받아서 Int를 결과로 돌려주는 함수를 표현하고 싶다면 아래처럼 괄호를 써야 한다.
    val evalAtZero: ((Int) -> (Int)) -> Int = { f -> f(0)}

}

// 함수 타입이 파라미터를 하나만 받거나 받지 않는 경우에도 괄호를  꼭 쳐야한다.
val inc: (Int) -> Int = { n -> n + 1} // 함숫값을 변수에 저장할 수 있다.
val emptyFunType: () -> Unit = {}

val lessThan = { a: Int, b: Int -> a < b} // 파라미터의 타입을 명시할 수 있다.

// 함수 타입도 널이 될수 있는 타입('?') 으로 지정할 수 있다.
// 함수타입 전체를 괄호로 둘러싼 다음 물음표를 붙이면 된다.
fun measureTime2(action: (() -> Unit)?):Long{
    val start = System.nanoTime()
    action?.invoke() // 널이 될수 있는 타입일 경우 호출 할 때 널체크를 해야한다.
    return System.nanoTime() - start
}


