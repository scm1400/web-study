package BasicGrammer

import java.lang.Math.PI

fun main() {

    println(원의넓이(5.toDouble()))

    println(파라미터가_가리키는_데이터는_바뀔_수_있다(intArrayOf(1,2,3)))

    val w:Double = 2.0
    val h:Double = 3.0

    // 이름을 명시하는 경우 파라미터 순서가 같지 않아도 된다다
   rectangleArea(w,h)
   rectangleArea(height = h,width = w)

    // 오버로딩
    // 코틀린에서 함수를 오버로딩 할 때는 오버로딩한 함수의 파라미터 타입이 모두 달라야 한다.
    // mul(1, 2)를 호출한다면 아래 두함수 모두 해당될 수 있지만 1이 Any의 하위 타입이므로 첫번재 식을 선택한다.
    fun mul(a: Int, b: Int) = a + b
    fun mul(o:Any, n:Int) = Array(n){o}
    mul(1 as Any, 2) // 구체적인 함수를 호출 하고 싶은 경우에는 as 타입 캐스팅을 사용해야한다.

    // 디폴트 파라미터를 줄 수 있다.
    // 따라서 인자없이 호출해도되고, 인자를 지정해 호출해도 된다
    fun readInt(n: Int = 10) = readLine()!!.toInt(n)
    readInt()
    readInt(10)

    // 디톨트가 지정되지 않은 파라미터와 디폴트가 지정된 파라미터가 같이 있는 경우, 디폴트 값이 있는 파라미터를 뒤쪽에 몰아두는 것이 좋은 코딩 스타일이다.
    fun restrictToRange(what: Int, from: Int = Int.MAX_VALUE, to: Int = Int.MAX_VALUE,): Int = Math.max(from, Math.min(to, what))
    restrictToRange(what = 1)  // 디폴트와 아닌것이 섞인 경우 디폴트를 지정하지 않고 호출하려면 이름 붙은 인자를 사용해야한다
    restrictToRange(1)

    // 파라미터로로 개수가 정해지지 않은 가변 인자/배열을 사용할 수 있다.
    fun printSorted(vararg items: Int){
        items.sort()
        println(items.contentToString())
    }
    // 이미 존재하는 배열을 파라미터로 넘기려면 Spread 연산자인 *을 사용해서 넘길 수 있다.
    // Spread는 배열을 복사해서 넣기 때문에 원본 배열에 영향을 주지 않는다
    var num = intArrayOf(1,2,3)
    printSorted(*num)
    printSorted(items = intArrayOf(1,2,3))
    //printSorted(items = 1,2,3) // vararg 파라미터를 이름 붙은 인자로 전달할 수 없다

    // 배열 내부에 참조가 들어있는 경우에는 참조가 복사되기 때문에 참조가 가리키는 데이터가 호출하는 쪽과 함수 내부 배열에서 공유된다.
    // vararg 파라미터도 파라미터 목록 맨 뒤에 위치시키는 것이 좋은 코딩 스타일이다.
    val a1 = intArrayOf(1,2,3)
    val b1 = intArrayOf(4,5,6)
    fun change(vararg items: IntArray): Array<out IntArray> {
        items[0][0] = 100
        return items
    }
    println(change(a1,b1).contentToString())
    println(a1[0])

    //지역 함수와 변수에는 가시성 변경자를 붙일 수 없다 !
}

// Double인 radius를 인자로 받고, Double 값을 리턴하는 함수
fun 원의넓이(radius: Double): Double {
    return PI*radius*radius
    val x = 1 // Unreachable Code 가 오류는 아니지만 경고는 표시된다.
}

fun increment(n: Int): Int {
    return n
//    return n++ //⚡ 자바와 달리 파라미터 n의 값을 함수 내부에서 변경할 수 없다.
}

fun 파라미터가_가리키는_데이터는_바뀔_수_있다(arr: IntArray): Int {
    return ++arr[0]
}

// 자바의 void, return 값이 없는 함수를 unit이라고 한다
// 아래 두 함수는 같다
fun prompt(name: String) {
    println("hi")
}
fun prompt2(name: String):Unit {
    println("hi")
    return; // 함수 본문 끝에 도달하기 전에 함수 실행을 마치려면 return을 사용해야한다. 또는 return Unit
}

// 함수가 단일 식으로 구현될 수 있다면 {}를 안쓰고 아래와 같이 써도 된다.
fun circleArea(radius: Double): Double = PI * radius * radius
// 단일 식인 경우 return 타입을 생략할 수도있다. (Double로 추론)
fun circleArea2(radius: Double) = PI * radius * radius


fun plus(a: String, b: String) = a+b
fun rectangleArea(width: Double, height: Double): Double {
    return width * height
}


