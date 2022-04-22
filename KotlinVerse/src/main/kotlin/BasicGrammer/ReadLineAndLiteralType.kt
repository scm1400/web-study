fun main() {

    //!!
    // 타입을 명시 하지 않으면 타입을 추론, 초기 값이 있을때만 가능
    val b = readLine()!!.toInt()
    //타입을 명시 할 수도 있음.
    val a: Int = readLine()!!.toInt()

    println(a+b)
}