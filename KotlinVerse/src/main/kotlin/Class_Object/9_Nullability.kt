package Class_Object

// 참조 값에 아무것도 참조하지 않는 경우를 나타내는 값 null


// NullPointerException 오류가 최악인 이유는 컴파일러가 정적인 타입 정보만으로는 오류를 잡아낼 수 없어서
// 런타임에 프로그램을 실행해봐야 오류를 찾을 수 있기 때문이다.

// 자바에서 모든 참조 타입은 널이 될수 있는 타입으로 간주된다.
// 하지만 코틀린에서는 기본적으로 모든 타입은 널이 될 수 없는 타입이다.


fun isLetterString(s: String): Boolean {
    if (s.isEmpty()) return false
    for (ch in s) {
        if(!ch.isLetter()) return false
    }
    return true
}

// 타입 뒤에 물음표(?)를 붙여서 널이 될수 있는 타입을 지정할 수 있다.
// 모든 널이 될 수 있는 타입은 원래 타입의 상위 타입이며, 원래 타입에 속하는 모든 값으로 이뤄진 집합을 null로 확장한 집합이 값의 집합이 된다.
fun isBooleanString(s: String?) = s == "false" || s == "true"

fun main() {
    isLetterString(null) // null을 넘기면 컴파일 오류가 발생한다.

    val s: String? = "hi"

    val ss: String = s // null이 될수 없는 타입에 값이 null이 아니더라도 null이 될 수 있는 타입을 대입할 수 없다.

    // Int와 Boolean 같은 원시 타입도 널이 될 수 있는 타입이 존재한다.
    // 하지만 원시 타입의 널이 될 수 있는 타입은 항상 박싱한 값만 표현한다.
    val n: Int = 1 // 원시 타입의 값
    val n2: Int? = 2 // 박싱한 타입의 값을 참조

    println(n + n2!!)

    // 가장 작은 null이 될 수 있는 타입 Nothing?
    val n3: Nothing? = null
    // 가장 큰 null이 될 수 있는 타입 Any?
    val n4: Any? = null
    
}