package _2_ClassAndObject

/**
 * public(공개): 멤버를 어디서나 볼 수 있다. 디폴트 가시성이다.
 * internal(모듈 내부): 멤버를 멤버가 속한 클래스가 포함된 컴파일 모듈 내부에서만 볼 수 있다.
 * protected(보호): 멤버를 멤버가 속한 클래스와 멤버가 속한 클래스의 모든 하위 클래스 안에서 볼 수 있다.
 * private(비공개): 멤버를 멤버가 속한 클래스 내부에서만 볼 수 있다.
 */

// 자바의 디폴트 가시성은 패키지 전용(Package Private)로 이 멤버가 속한 클래스가 들어있는 패키지 내부 어디서나 볼 수 있다.
// 자바에서 공개 멤버로 정의하고 싶으면 Public을 붙여야 한다.


// firstName과 familyName 프로퍼티는 private이므로 main() 함수에서 이 둘을 볼 수 없다.
// 반면 fullName()은 public이다.
class Person7(private val firstName: String, private val familyName: String){
    fun fullName() = "$firstName $familyName"
}

// 주생성자의 가시성을 지정하려면 constructor 키워드를 꼭 명시해야한다
class Person8 private constructor(){
    fun showMe() = println("empty")
}

fun main() {
    val person = Person7("Earl","Gray")
    // println(person.firstName) -> 에러
    println(person.fullName())
    // println(Person8().showMe()) -> 주생성자가 private이므로 에러
}
