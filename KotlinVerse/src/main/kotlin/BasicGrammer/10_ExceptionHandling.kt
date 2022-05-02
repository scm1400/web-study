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
    // 자바에서는 catch (FooException | BarException e){} 와 같이 한 캐치 블록 안에서 여러 예외를 처리할 수 있다.
    // 코틀린에서는 아직 이런 핸들러를 지원하지 않는다

    fun readInt(default: Int): Int {
        try {
            return readLine()!!.toInt()
        }
        // 상위 예외를 먼저 작성하면 하위 예외로 도달 할 수 없기 때문에 하위 예외는 죽은코드이다
        catch (e: Exception){
            return 0
        }
        catch (e: NumberFormatException) {
            return default
        }
    }

    // 자바와 달리 코틀린에서는 try 문이 식으로 쓰일수 있다.
    fun readInt2(default: Int) = try {
        readLine()!!.toInt()
    } catch (e: NumberFormatException) {
        default
    }

    // 자바와 달리 코틀링네서는 checked exception과 unchecked exception을 구분하지 않는다.


    // finally 를 사용할 수 있다.
    fun readInt3(default: Int) = try {
        readLine()!!.toInt()
    } finally {
        default // 이렇게 사용할 수 없음 : try를 식으로 사용 할 경우, finally 값은 전체 try 블록의 값에 영향을 미치지 못한다.
        println("Error")
    }



}