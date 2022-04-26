fun main() {

    //!!는 NULL 아님 단언, NULL인 경우 예외 발생
    // 타입을 명시 하지 않으면 타입을 추론, 초기 값이 있을때만 가능
    val b = readLine()!!.toInt() // val


    //타입을 명시 할 수도 있음.
    val a: Int = readLine()!!.toInt()

//    var 은 가변변수
//    val은 불변



   println(a+b)

    /**
     * 키워드는 문자, 숫자, _ 만 포함
     * 숫자로 시작할 수 없다. val 3t=2
     * $ 사용 불가
     */

    //작은역따옴표를 감싼 키워드를 사용 가능
    val `name with spaces` = 2

    println(`name with spaces`)

}