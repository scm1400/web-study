package _2_ClassAndObject

// 프로퍼티가 사용하는 내부 필드는 항상 캡슐화돼 있고
// 클래스 정의 밖에서는 이 내부 필드에 접근할 수 없다.
// 클래스 인스턴스의 프로퍼티나 메서드를 사용하려면 우선 인스턴스를 명시적으로 생성해야 한다.
fun main() {

    // 생성자 호출을 사용하면 프로그램이 새 인스턴스에 대한 힙 메모리를 할당한 다음,
    // 인스턴스의 상태를 초기화해주는 생성자 코드를 호출해준다.
    val person = Person(); // Person 인스턴스 생성
    val person2 = Person2("Earl","Gray")

    person.firstName = "Earl"
    person.familyName = "Gray"
    person.age = 25

    person.showMe()

}