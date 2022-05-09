package Class_Object

import Class_Object.prefix // 최상위 프로퍼티를 임포트할 수도 있다.
import java.io.File

// ?최상위 프로퍼티는 Class에서는 사용 못하고 fun에서만 사용되는듯?
val prefix = "Hello, " // 최상위 불변 프로퍼티
lateinit var text: String // 최상위 프로퍼티와 지역 변수에서 늦은 초기화를 사용할 수 있다.

fun main() {
    val name = readLine() ?: return
    println("$prefix$name")
    text = "2"
}

// [ 늦은 초기화 ]
// 어떤 프로퍼티는 클래스 인스턴스가 생성된 뒤에,
// 그러나 해당 프로퍼티가 사용되는 시점보다는 이전에 초기화돼야 할 수도 있다.
class Content {
    // lateinit 표시가 붙은 프로퍼티는 값을 읽으려고 시도할 때
    // 프로그램이 프로퍼티가 초기화 됐는지 검사해서 초기화 되지 않은 경우
    // UninitializedPropertyAccessException을 던진다.
    lateinit var text: String // val로 정의하면 오류가 난다,
                              // Int나 Boolean 같은 원시 타입으로 정의할 수 없다.

    fun loadFile(file: File) {
        text = file.readText()
    }
}
