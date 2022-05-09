package Class_Object

// null 복합 연산자인 '?:' 를 사용하면 null을 대신할 디퐅트 값을 지정할 수 있다.

fun sayHello(name: String?) {
    println("Hello, " + (name ?: "Unkown"))
}

fun main() {
    sayHello("Earl")
    sayHello(null) // null을 대신할 디폴트 값 'Unkown'이 출력된다


    // safe call과 elvis 연산자를 조합해서 수신 객체가 널일 때의 디폴트 값을 지정하면 유용하다.
    val n = readLine()?.toInt() ?: 0
}

class Name(val firstName: String, val familyName: String?)

class Person10(val name: Name?){

    // return이나 throw 같은 제어 흐름을 깨는 코드를 elvis 연산자 오른쪽에 넣을 수 있다.
    fun describe(): String{
        val currentName = name ?: return "Unkown"
        return "${currentName.familyName} ${currentName.firstName}"
    }
}

// 우선순위 면에서 elvis 연산자는 or 등의 중위 연산자와 in, !in 사이에 위치한다.
// 비교/동등성 연산자나 ||, &&, 대입보다 더 우선순위가 높다.