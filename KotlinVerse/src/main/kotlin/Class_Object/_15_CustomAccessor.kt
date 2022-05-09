package Class_Object

import java.util.*

// [ 커스텀 접근자 ]
// 커스텀 접근자는 프로퍼티 값을 읽거나 쓸 때 호출되는 특별한 함수다.

// 주 생성자에 선언한 프로퍼티는 접근자 메서드를 선언할 수 없다.
// lateinit 프로퍼티의 경우 항상 자동으로 접근자가 생성되기 때문에 직접 커스텀 접근자를 정의할 수 없다.
class Person11(val firstName: String, val familyName: String){
    val fullName: String
        // 프로퍼티 값을 읽을 때 사용하는 커스텀 getter 정의
        // 게터에는 파라미터가 없고, 반환 타입은 지정할 수 있다.
        get(): String {
            return "$firstName $familyName"
        }

    val fullName2: String
        // 식이 본문인 형태를 사용 할 수 있다.
        get() = "$firstName $familyName"

    // 코틀린 1.1부터는 타입을 생략하고 타입 추론에 의존하면 된다.
    // 불변(val) 프로퍼티 접근자는 읽기 접근자 하나 뿐이므로 뒷받침하는 필드가 없다. 이런 경우 인스턴스에서 전혀 메모리를 차지하지 않는다.
    // 프로퍼티 형태인 함수와 같다.
    val fullName3
        get() = "$firstName $familyName" // String 추론
}
fun main() {
    // 프로퍼티를 읽을때 프로그램이 자동으로 위에서 정의한 커스텀 getter를 호출한다.
    val person = Person11("Earl", "Gray")
    println(person.fullName)

    val person2 = Person12("Earl", "Gray", 27)
    person2.age2 = 20 // 커스텀 세터 호출
    println(person2.age2) // 커스텀 게터 호출
}


class Person12(val firstName: String, val familyName: String, age: Int){
    // 프로퍼티가 어떤 저장된 값을 사용하지만 프로퍼티에 대한 접근을 커스텀화해야 할 경우,
    // 다음과 같이 뒷받침하는 필드에 접근할 수 있다.
    val age: Int = age
        get(){
            println("Accessing age : $field")
            return field
        }

    // var로 정의하는 가변 프로퍼티에는 Getter와 Setter 두 가지 접근자를 사용할 수 있다.
    var age2: Int? = null
        set(value) {
            lastChanged = Date()
            if (value != null && value <= 0){
                throw IllegalArgumentException("Invalid age: $value")
            }
            field = value
        }

    // 프로퍼티 접근자에 가시성 변경자를 붙일 수도 있다.
    var lastChanged: Date? = null
        private set // 클래스 밖에서는 변경할 수 없다.
}


