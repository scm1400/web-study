package _1_BasicGrammer

fun main() {

    // 배열 선언
    val a = emptyArray<String>()
    val b = arrayOf("hello", "world") // String 타입
    val c = arrayOf(1, 4, 9) // Intger타입
    var d = arrayOf("1",1,'r') // 오브젝트타입
    d = arrayOf(1,1,1,1) // 여전히 오브젝트타입
    println(c.javaClass)
    println(d.javaClass)

    // 입력한 값의 제곱으로 이뤄진 배열을 만듬
//    val size = readLine()!!.toInt()
    val squares = Array(4){ (it+1) * (it+1) } // it는 인덱스를 표현하는 변수
    squares.forEach { int -> println(int) }

    //Array<Int>를 사용하는 배열은 제대로 작동하지만 모든 수를 박싱하기 때문에 그다지 실용적이지 못하다
    //코틀린에서는 new를 사용하지 않기 때문에 배열 원소를 명시적으로 초기화해야한다?
    val intArray = emptyArray<Int>()  // 실용 x
    val intArray2 = IntArray(10) // 실용 o

    // numbers 는 squares 배열과 같은 데이터 집합을 함께 공유하게 된다.
    // numbers의 원소를 변경하면 squares의 원소도 변경됨
    val numbers = squares
    numbers[0] = 1000;

    // 원본과 별도의 배열을 만드려면 copyOf() 함수를 사용해야한다.
    val numbers2 = squares.copyOf()
    numbers2[0] = 1000 // squares에 영향이 없다
    squares.copyOf(5) // squares의 사이즈는 4인데 5의 크기를 복사하면 나머지 요소는 0으로 채워짐.

    // 자바에서는 상위 타입의 배열에 하위 타입의 배열을 대입할 수 있지만
    // 코틀린은 하위 타입과 관계가 성립하지 않는다고 간주된다.
    val strings = arrayOf("one", "two")
    //val objects: Array<Any> = strings // 오류 발생

    // 문자열은 == 로 비교할 수 있었지만, 배열에서는 참조 객체를 비교한다
    // 배열 내용을 비교할때는 contentEquals() 함수를 사용해야한다
    intArrayOf(1,2,3).contentEquals(intArrayOf(1,2,3))

}