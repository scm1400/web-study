package BasicGrammer

fun main() {

    // 자바와 마찬가지로 throw를 사용해 예외를 던진다
    // 예외를 던진 때 예외를 잡아내는 핸들러가 있는지 찾는다. 핸들러가 있다면 예외 핸들러가 예외를 처리한다.
    // 현재 함수 내부에서 핸들러를 찾을 수 없으면 함수 실행이 종료되고 함수가 스택에서 pop 된다.
    // 그리고 호출한 쪽의 문맥 안에서 예외 핸들러를 검색한다. 이런 경우 예외를 호출자에게 전파했다고 말한다.
    // 예외처리 단계는 기본적으로 자바와 같다!
    fun parseIntNumber(s: String): Int {
        var num = 0
        if(s.length !in 1..31) throw NumberFormatException("Not a number: $s")
        for (c in s) {
            if (c !in '0'..'1') throw NumberFormatException("Not a number: $s")
            num = num*2 + (c-'0')
        }
        return num
    }

    // try-catch 문
    fun readInt(default: Int): Int {
        try {
            return readLine()!!.toInt()
        } catch (e: NumberFormatException) {
            return default
        }
    }
}