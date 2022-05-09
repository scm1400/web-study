package BasicGrammer

import java.util.Date

fun main() {

    //문자열에 특수문자가 들어가면 이스케이프 시퀀스를 사용해야 한다.
    val text = "hello, world!\n this is \"multiline\" string"
    println("\u03C0 \u2448 3.14")

    // 문자열 템플릿(String Template)
    // ${} 중괄호 사이에 어떤 올바른 코틀린 식이든 문자열에 넣을 수 있다.
    println("${ Date() }")
    val name = "EarlGray"
    val message = """
        hello, $name!
        Today is ${Date()}
    """.trimIndent() // 들여쓰기를 제거해주는 함수
    println(message)

    // 로우 문자열에 특수 문자를 추가하고 싶은 경우 ${} 안에 특수 문자를 넣으면 된다.
    println(
        """
            &&
            this is trple quote: '${" \"\"\" "}'
        """.trimIndent()
    )

    // 인덱스 연산자를 사용해 문자에 접근 할 수 있다.
    val s = "Hello!"
    println(s[5]) //!
    // + 연산자로 문자열을 연결 할 수 있다.
    val s2 = "Hello!" + (2+1)
    println(s2)

    //자바와 달리 문자열 비교시 ==를 사용 할 수 있다.
    //자바처럼 객체를 비교하는 참조 동등성을 쓰고싶으면 ===, !=== 연산자를 사용하면 된다.
    println(
        s == s2.substring(0,6) // true
    )
    println( s === s2) // false


}