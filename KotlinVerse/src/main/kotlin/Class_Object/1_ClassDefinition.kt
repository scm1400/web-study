package Class_Object

// 코틀린에서는 소스 파일의 이름을 그 안에 들어있는 공개 클래스 이름과 똑같이 만들 필요가 없다.
// 한 파일 안에 여러 공개 클래스를 넣을 수도 있다.
// 그러나 만약 어떤 파일 안에 클래스가 하나만 들어있다면 보통은 클래스 이름과 파일 이름을 같게 한다.

// 모든 Person 클래스의 인스턴스마다 firstName, familyName, age라는 프로퍼티와
// fullName() 및 showMe() 함수가 있음을 알려준다.
// 기본적으로 코틀린 클래스는 Public 가시성이다.
class Person {
    // 생성자로 초기활 방법이 없으면 모든 클래스가
    // 각 프로퍼티를 같은 값을 사용하게 됨
    var firstName: String = ""
    var familyName: String = ""
    var age: Int = 0;

    fun fullName() = "$firstName $familyName"

    // this로 수신 객체를 참조할 수 있다.
    // 대부분의 경우 this를 디폴트로 가정하기 때문에 수신 객체의 멤버를 참조할 때는 this를 생략해도 된다.
    fun fullName2() = "${this.firstName} ${this.familyName}"

    // 클래스 프로퍼티와 메서드 파라미터 이름이 같은 경우, this를 써야한다.
    fun setName(firstName: String, familyName: String) {
        this.firstName = firstName
        this.familyName = familyName
    }

    fun showMe() {
        println("${fullName()}: $age")
    }

    // 마치 변수처럼 프로퍼티를 참조하는 구문
    // p는 수신 객체
    fun showAge(p: Person) = println(p.age) // 프로퍼티 읽기

    fun readAge(p: Person) {
        p.age = readLine()!!.toInt() // 프로퍼티 쓰기
    }

    // 멤버 함수도 똑같이 수신 객체 p가 있고, 이런 경우 함수를 메서드(method)라 부른다.
    fun showFullName(p: Person) = println(p.fullName()) // 메서드 호출하기기


}

