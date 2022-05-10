package Class_Object

// [ 객체 선언 ]
// 코틀린에서는 클래스와 비슷한 방법으로 싱글톤을 선언한다.
// 다만 class 대신 object라는 키워드를 사용한다.

// 이런 객체 선언은 클래스를 정의하는 동시에 클래스의 인스턴스를 정의하는 것이기도 하다.
// 객체 정의는 스레드 안전하다.
// 여러 스레드에서 싱글톤에 접근하더라도
// 오직 한 인스턴스만 공유되고 초기화 코드도 단 한번만 실행되도록 보장한다.
// 객체 인스턴스는 항상 암시적으로 만들어지기 때문에 주생성자나 부생성자가 없다.
object Application {
    val name = "My Application"

    override fun toString() = name

    fun exit() { }
}

// 일반적으로 객체의 인스턴스는 단 하나뿐이므로 인스턴스만 가리켜도 어떤 타입을 쓰는지 알 수 있다.
// 따라서 객체를 타입으로 사용해도 무의미하다.
fun describe(app: Application) = app.name
fun decribe2() = Application.name // 타입을 사용하지 않고 바로 객체에서 가져오면 됨

fun main() {
    // 초기화는 싱글턴 클래스가 실제 로딩되는 시점까지 지연된다.
    // 보통 프로그램이 처음 객체 인스턴스에 접근할 때 초기화가 이뤄진다.
    println(Application)
    println(describe(Application))
    println(decribe2())
}

// 자바에서는 private 생성자와 static 상태를 조합한 일반적인 클래스 정의를 사용해 싱글톤을 에뮬레이션 한다.