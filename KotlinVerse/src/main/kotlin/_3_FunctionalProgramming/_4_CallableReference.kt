package _3_FunctionalProgramming

// 다른 함수의 참조에 의한 호출

fun check2(s: String, condition: (Char) -> Boolean): Boolean {
    for (c in s){
        if (!condition(c)) return false
    }
    return true;
}

fun isCapitalLetter(c: Char) = c.isUpperCase() && c.isLetter()

fun evalAtZero(f: (Int) -> Int) = f(0)
fun inc2(n: Int) = n + 1
fun dec2(n: Int) = n - 1

class Person(val firstName: String, var familyName: String){
    fun hasNameOf(name: String) = name.equals(firstName, ignoreCase = true)
}

fun main() {
    // 이미 함수 정의가 있고, 이 함수 정의를 함숫값처럼 고차 함수에 넘기고 싶다면?
    // 아래 처럼 람다식으로 감싸서 전달할 수도 있다.
    println(check("Hello") {c -> isCapitalLetter(c)})
    println(evalAtZero { i -> inc2(i) })
    println(evalAtZero { i -> dec2(i) })

    // 호출 가능 참조를 사용하면 더 단순하게 표현할 수 있다.
    println(check("Hello", ::isCapitalLetter))
    println(evalAtZero(::inc2))
    println(evalAtZero(::dec2))

    // ::을 클래스 이름 앞에 적용하면 클래스의 생성자에 대한 호출 가능 참조를 얻는다다
    val createPerson = ::Person
    val person = createPerson("Earl", "Gray")

    // 코틀린 1.1부터는 바인딩된 호출 가능 참조(bound callable reference)라는 :: 사용법이 도입됐다.
    // 클래스 인스턴스 문맥 안에서 멤버 함수를 호출하고 싶을 때 바인딩된 호출 가능 참조를 사용한다.
    val isMe = Person("Earl","Gray")::hasNameOf
    println(isMe("Earl")) // true

    // 호출 가능 참조 자체는 오버로딩된 함수를 구분할 수 없다.
    // 오버로딩된 함수 중 어떤 함수를 참조할지 명확히 하려면 타입을 지정해줘야한다.
    fun max(a: Int, b: Int) = if (a > b) a else b
    fun max(a: Double, b: Double) = if (a > b) a else b
    val f: (Int, Int) -> Int = ::max
    //val g = ::max // 오류: 어떤 함수를 호출할지 모름

    // 호출 가능 참조를 직접 호출하고 싶다면 아래처럼 참조 전체를 괄호로 둘러싼 다음 인자를 지정하면 된다.
    fun max2(a: Int, b: Int) = if (a > b) a else b
    println((::max2)(1, 2))

    // 프로퍼티에 대한 호출 가능 참조를 만들 수 있다.
    // 이런 참조 자체는 실제로는 함숫값이 아니고, 프로퍼티 정보를 담고 있는 리플랙션(Reflection) 객체다.
    val readName = person::firstName.getter
    val writeFamilyName = person::familyName.setter // var인 경우 setter 호출 가
    writeFamilyName("modified")
    println(readName()); println(person.familyName)

    // 현재 지역 변수에 대한 호출 기능 참조는 지원하지 않는다.
}
