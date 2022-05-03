package Class_Object

class `1_ClassDefinition` {

    // 모든 Person 클래스의 인스턴스마다 firstName, familyName, age라는 프로퍼티와
    // fullName() 및 showMe() 함수가 있음을 알려준다.
    class Person {
        var firstName: String = ""
        var familyName: String = ""
        var age: Int = 0;

        fun fullName() = "$firstName $familyName"
        // this로 수신 객체를 참조할 수 있다.
        // 대부분의 경우 this를 디폴트로 가정하기 때문에 수신 객체의 멤버를 참조할 때는 this를 생략해도 된다.
        fun fullName2() = "${this.firstName} ${this.familyName}"

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
}
