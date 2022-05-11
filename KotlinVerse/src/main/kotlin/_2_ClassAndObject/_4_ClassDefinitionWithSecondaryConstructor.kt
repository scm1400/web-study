package _2_ClassAndObject

import java.lang.IllegalArgumentException

// 여러 생성자를 사용해 클래스 인스턴스를 서로 다른 방법으로 초기화 하고 싶은 경우
// 부생성자(constructor)를 사용해 해결할 수 있다.
// 아래처럼 클래스에 주생성자를 선언하지 않은 경우, 모든 부생성자는 자신의 본문을 실행하기 전에
// 프로퍼티 초기화와 init 블록을 실핸한다. 이렇게 하면 어떤 부생성자를 호출하든지 공통적인 초기화 코드가 정확히 한 번만 실행되게 보장할 수 있다.
class Person4 {
    val firstName: String
    val familyName: String

    // 부생성자 파라미터 목록에는 val/var 키워드를 쓸 수 없다는 점을 유의하자
    constructor(firstName: String, familyName: String){
        this.firstName = firstName
        this.familyName = familyName
    }
    // 부생성자 안에서는 return 을 사용할 수 있다.
    constructor(fullName: String){
        val names = fullName.split(" ")
        if (names.size != 2) {
            throw IllegalArgumentException("Invalid name: $fullName")
        }
        firstName = names[0]
        familyName = names[1]
        return
    }
}

// 주생성자가 없는 경우 생성자 위임
class Person5{
    val fullName: String

    // 부생성자 파라미터 목록 뒤에 콜론(:)을 넣고 그 뒤에 일반 함수를 호출하는 것 처럼 작성하되,
    // 함수 이름 대신 this를 사용하면 생성자 위임 호출이 된다.
    constructor(firstName: String, familyName: String) :
            this("$firstName $familyName")

    constructor(fullName: String){
        this.fullName = fullName
    }

}

// 주생성자가 있는 경우 생성자 위임
class Person6(val fullName: String){
    constructor(firstName: String, familyName: String):
            this("$firstName $familyName")
}