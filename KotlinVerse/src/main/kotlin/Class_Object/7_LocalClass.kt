package Class_Object

fun main() {

    // 함수 본문에서 클래스를 정의할 수 있다.
    // 자신을 둘러싼 코드 블록 안에서만 쓰일 수 있다.
    class Point(val x: Int, val y: Int){
        fun shift(dx: Int, dy: Int): Point = Point(x + dx, y + dy)
        override fun toString() = "($x, $y)"
    }

    val p = Point(10, 10)
    println(p.shift(-1, 3))
    println(p.javaClass)

    // 지역 클래스도 자신을 둘러싼 코드의 선언에 접근 할 수 있다.
    // 자신이 접근할 수 있는 값을 포획 할 수 있고, 변경도 할 수 있다.
    // 내포된 클래스와 달리 지역 클래스는 자신을 둘러싼 블록에서만 사용할 수 있으므로, 가시성 변경자를 붙일 수 없다.
    var x = 1
    class Counter {
        fun increment() {
            x++
        }
        // 지역 클래스 안의 내포된 클래스는 반드시 inner 클래스여야만 한다
        // inner를 붙이지 않으면 오류
        inner class test{

        }
    }
}

fun foo(){
//    println(Point(0,0)) -> 에러 : 코드블록 밖에서 Point 클래스에 접근 할 수 없다
}
