package _2_ClassAndObject

// 내포된 클래스와 마찬가지로 내포된 객체도 인스턴스가 생기면 자신을 둘러싼 클래스의 비공개 멤버에 접근할 수 있다.

// 생성자를 직접 사용하고 싶지 않을 때 -> 널을 반환하거나 다른 타입의 객체를 반환하고 싶을 때
// 생성자를 비공개(private)로 지정해 클래스 외부에서 사용할 수 없게 한 다음,
// 내포된 객체에 팩토리 메서드 역할을 하는 함수를 정의하고 그 함수 안에서 필요에 따라 객체의 생성자를 호출할 수 있다.
class Application2 private constructor(val name: String){
    object Factory {
        fun create(args: Array<String>): Application2? {
            val name = args.firstOrNull() ?: return null // 생성자로는 null을 반환 할 수 없지만 내포된 객체를 이용해 가능하다.
            return Application2(name)
        }
    }
}

// 코틀린에서는 Factory 메서드를 동반 객체(Companion Object)로 정의함으로써
// 내포된 객체의 이름을 지정하지 않고 create를 호출할 수 있다.
class Application3 private constructor(val name: String){
    // 동반 객체의 경우 이름을 아예 생략할 수도 있다. 이런 방식을 더 권장한다.
    // 디폴트 이름은 Companion이다.
    // 클래스에 동반 객체가 둘 이상 있을 수는 없다.
    companion object {
        fun create(args: Array<String>): Application3?{
            val name = args.firstOrNull() ?: return null
            return Application3(name)
        }
    }
}

fun main(args: Array<String>){
    // Companion Object를 사용하지 않은 경우
    val app1 = Application2.Factory.create(args) ?: return
    // Companion Object를 사용한 경우
    val app2 = Application3.create(args) ?: return

}

// companion 변경자를 최상위 객체에 붙일 수 없다. -> 동반 객체를 연결할 클래스 정의가 없기 때문에
/*
companion object testApp {
    val name = "My Application"
}
*/

object testApp2 {
    val name = "My Application"
    /* 다른 객체에 내포된 객체 앞에 companion을 붙일 수 없다. -> 불필요한 중복이기 떄문에
    companion object testApp3 {
        val name = "My Application"
    }
     */
}

// 자바 static 멤버와 마찬가지로 동반 객체의 멤버도 외부 클래스의 모든 멤버에 멤버 가시성과 무관하게 접근 할 수 있다.
// -> private class 안에 object가 있어도 접근가능
// 코틀린의 동반 객체의 문맥은 객체 인스턴스라는 점에서 자바 static 멤버와 차이가 있다.
// 이로 인해 자바의 static 멤버보다 코틀린 동반 객체가 더 유연하다.
// 코틀린 동반 객체는 다른 상위 타입을 상속할 수도 있고, 일반 객체처럼 여기저기 전달될 수 있기 때문이다.

// + 자바의 static{} 초기화 블록처럼 동반 객체 안에서도 init 블록을 사용할 수 있다.