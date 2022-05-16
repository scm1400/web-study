package _3_FunctionalProgramming

// 확장 함수는 어떤 클래스의 멤버인 것처럼 호출할 수 있는
// 그러나 실제로는 멤버가 아닌 함수를 뜻한다.

import _3_FunctionalProgramming.truncate // 임포트 할 때 String.truncate가 아닌 truncate로 호출 한다.
                                         // 전체 이름으로 호출할 수 없는 이유는 전체 이름에서 패키지 이름과 클래스 이름이 차지할 부분에 수신 객체 식이 오기 때문

// String 타입에 문자열의 길이를 제한하는 함수를 추가한 코드
fun String.truncate(maxLength: Int): String {
    return if (length <= maxLength) this else substring(0, maxLength) // this를 사용하지 않아도 암시적으로 this를 사용해 수신 객체의 멤버나 확장 함수에 접근할 수 있다.
}
// 위의 함수와 같다.
// 확장 함수는 근본적으로 특정 클래스 타입의 객체를 첫번째 인자로 받는 일반 함수를 마치 클래스 멤버인 것처럼 쓸 수 있게해주는 편의 문법이다.
fun truncate2(s: String, maxLength: Int): String {
    return if (s.length <= maxLength) s else s.substring(0, maxLength)
}

// 널이 될 수 있는 수신 객체 타입
fun String?.truncate3(maxLength: Int): String? {
    if (this == null) return null
    return if (length <= maxLength) this else substring(0, maxLength)
}

// 확장 함수 자체는 수신 객체가 속한 타입의 캡슐화를 깰 수 없다.
class Person4(val name: String, private val age: Int){
    // 클래스 본문 안에서 확장 함수를 정의 할 수 있다.
    // 이런 경우 확장 함수가 수신 객체의 멤버인 동시에 확장 함수가 된다.
    fun Person4.showInfo() = println("$name, $age") // age에 접근할 수 있음
    fun fullName() = "$name"
}


// 확장 함수는 클래스 밖에 정의된 함수이므로 수신 객체가 속한 클래스의 비공개 멤버에 접근할 수 없다.
//fun Person4.showInfo() = println("$name")//, $age") // age에 접근 할 수 없음

fun Person4.hasName(name: String) = name.equals(this.name, ignoreCase = true)
fun Person4.fullName() = "$name" // Extension is shadowed by a member ... (클래스의 멤버에 의해 가려졌다)


interface Truncated {
    val truncated: String
    val original: String
}

// 다른 확장 함수 안에 확장 함수를 내포시킬 수도 있다.
// 이런 경우 this 식은 가장 안쪽에 있는 함수의 수신 객체를 뜻한다.
private fun String.truncator(max: Int) = object: Truncated {
    // 바깥쪽 함수의 수신 객체를 참조하고 싶다면 한정시킨 this를 사용해 함수 이름을 명시해야한다.
    override val truncated
        get() = if (length <= max) this@truncator else substring(0, max)

    override val original
        get() = this@truncator
}

fun main() {
    println("Hello".truncate(3))

    val person = Person4("earl", 28)

    // 확장 함수는 바인딩된 호출 가능 참조 위치에 사용할 수도 있다 (::)
    val f = Person4("earl", 28)::hasName
    println(f("earl"))

    // 위에 fullName() 함수가 두개 정의 되있다
    // 이런 경우 클래스 안에 있는 멤버 함수를 우선적으로 선택한다.
    println(person.fullName())

    val truncator = "Hello".truncator(3)
}