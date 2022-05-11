package _2_ClassAndObject

// 자바의 new와 같은 키워드를 사용하지 않는
// 클래스 헤더의 파라미터 목록을 주생성자(Primary Constructor) 선언이라 부른다.

// 주생성자는 함수와 달리 본문이 하나가 아니다.
// 클래스 정의 내에서 프로퍼티 초기화와 초기화 블록이 등장하는 순서대로 구성된다.

// class Person2(firstName: String, familyName: String)
// 파라미터에 val이나 var을 붙이면 자동으로 해당 생성자 파라미터로 초기화되는 프로퍼티를 정의한다.
// 이때 파라미터 이름을 프로퍼티 초기화나 init 블록 안에서 참조하면 생성자 파라미터를 가르키고,
// 다른 위치에서 참조하면 프로퍼티를 가르키게 된다.
class Person2(val firstName: String,val familyName: String)
{
    val fullName = "$firstName $familyName"
    val fullName2: String

    // 초기화 블록: 클래스 초기화 시 필요한 로직을 수행할 수 있다.
    // 초기화 블록에는 return 문이 들어가지 못한다는 점에 유의하자.
    // 초기화 블록에서 프로퍼티를 초기화할 수 있다.
    init {
        println("Created new Person instance: $fullName")

        fullName2 =  familyName + firstName
    }

    //val 또는 var 이 안붙은 주생성 파라미터를 init 블록 밖에서 사용 할 수 없다.
    fun printFirstName() {
        println(firstName)
    }
}

// val/var 파라미터를 사용하면 멤버가 포함되지만 본문은 비어있는 클래스를 정의할 수 있다.
class Person3(val firstName: String, val familyName: String)

// 디폴트 값과 vararg를 생성자 파라미터에 사용할 수 있다.
class Room(vararg val persons: Person){
    fun showNames() {
        for (person in persons) {
            println(person.firstName)
        }
    }
}

fun main() {
    val person = Person2("Earl","Gray")
}