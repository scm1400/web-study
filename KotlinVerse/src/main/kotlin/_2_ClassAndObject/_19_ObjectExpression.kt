package _2_ClassAndObject

// 코틀린은 명시적인 선언 없이 객체를 바로 생성할 수 있는 특별한 식을 제공한다.
// 객체 식은 자바 익명 클래스(anonymous class)와 아주 비슷하다.

fun main() {
    // 객체 식도 식이므로 아래 예제처럼 객체 식이 만들어내는 값을 변수에 대입할 수 있다.
    fun midPoint(xRange: IntRange, yRange: IntRange) = object {
        val x = (xRange.first + xRange.last)/2
        val y = (yRange.first + yRange.last)/2
    }

    val midPoint = midPoint(1..5, 2..6)
    val midPoint2 = midPoint2(1..5, 2..6)

    println("${midPoint.x} ${midPoint.y}")
    println("${midPoint2.x} ${midPoint2.y}") // 최상위 함수로 정의한 midPoint2()의 객체 멤버에 접근 할 수 없다.
                                             // private를 붙이면 접근할 수 있다.

    // 객체 식이 만들어내는 객체는 객체 인스턴스가 생성된 직후 바로 초기화된다.
    // 아래 코드에서 o.a에 접근하기 전에 x를 표시했음에도 x의 값으로 2가 표시된다.
    var x = 1
    val o = object {
        val a = x++
    }
    println("$x") // x의 값이 2로 표시된다.
}

fun printMiddle(xRange: IntRange, yRange: IntRange){
    /* 객체를 함수 안에 정의할 수는 없다.
    객체는 싱글톤인데 지역 객체들은 자신을 둘러싼 바깥 함수가 호출될 때마다 매번 다시 생성돼야 하기 때문이다.
    object MidPoint {
        val x = (xRange.first + xRange.last)/2
        val y = (yRange.first + yRange.last)/2
    }
     */
}

// private를 붙이지 않으면 Any의 상위 타입으로 가정하기 때문에 객체 멤버에 접근 할 수 없다
// 아래 객체 식에는 상위 타입을 명시하지 않았기 때문에 any 타입으로 가정한다.
// private를 붙이면 anonymous object 타입으로 가정한다.
private fun midPoint2(xRange: IntRange, yRange: IntRange) = object {
    val x = (xRange.first + xRange.last)/2
    val y = (yRange.first + yRange.last)/2
}
