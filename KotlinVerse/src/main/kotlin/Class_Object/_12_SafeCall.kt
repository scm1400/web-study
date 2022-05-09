package Class_Object

// 이 함수는 콘솔을 표준 I/O로 사용하는 한 잘 작동한다.
// 하지만 프로그램이 파일을 입력에 파이프로 연결하면, 파일이 비어있는 경우 KotlinNull PointerException이 발생시킬 수 있다.
fun readInt() = readLine()!!.toInt()

// safe call 연산자 사용
// safe call 연산자는 수신 객체(왼쪽 피연산자)가 null이 아닌 경우 일반적인 함수 호출처럼 작동한다.
// 수신 객체가 null이면 안전한 호출 연산자는 호출을 수행하지 않고 그냥 null을 돌려준다
// ||나 &&와 비슷하게 safe call도 지연 연산의 의미를 따른다.
fun readInt2() = readLine()?.toInt()

fun readInt3(): Int? {
    val tmp = readLine()

    return tmp?.toInt()
}

fun main() {
    // safe call 연산자를 연쇄시켜 다음과 같이 쓸 수 있다.
    // safe call 연산자가 null을 반환할 수 있기 때문에 연산이 반환하는 값의 타입은
    // 상응하는 null을 고려하지 않은 연산자 반환 타입의 널이 될 수 있는 버전이 된다.
    println(readLine()?.toInt()?.toString(16))
}