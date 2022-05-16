package _3_FunctionalProgramming

// [ 비지역적 제어 흐름 ]


fun forEach2(a: IntArray, action: (Int) -> Unit) {
    for (n in a) action(n)
}

inline fun inlineForEach(a: IntArray, action: (Int) -> Unit) {
    for (n in a) action(n)
}

// inline 키워드가 붙은 함수는 컴파일 타임에 코드가 변환되며,
// lambda 함수가 호출되는게 아니라 직접 삽입되기 때문에 return을 만나게되면,
// inline 함수를 호출하는 상위함수가 return 되며 실행이 종료된다.
fun main() {
    // 고차 함수를 사용하면 return 문 등과 같이 일반적인 제어 흐름을 깨는 명령을 사용할 때 문제가 생긴다.
    forEach2(intArrayOf(1, 2, 3, 4)){
        // return 문은 디폴트로 자신을 둘러싸고 있는 fun, get, set으로 정의된 가장 안쪽 함수로부터 제어 흐름을 반환시킨다.
        // 따라서 @forEach2 레이블을 붙이지 않으면 main 함수로부터 반환을 시도하는 코드가 된다.
        // JVM에서는 람다가 효율적으로 자신을 둘러싸고 있는 함수를 반환시킬 방법이 없으므로 금지된다.
        // 이런 문을 비지역적 retrun이라고 한다
        if (it < 2 || it > 3) return@forEach2
        println(it)
    }

    // 람다 대신 익명 함수를 사용해 해결할 수 있다
    forEach2(intArrayOf(1, 2, 3, 4), fun(it: Int){
        if (it < 2 || it > 3) return
        println(it)
    })

    // 람다 자체로부터 제어 흐름을 반환하고 싶다면
    // break나 continue에 대해 레이블을 사용했던 것처럼 return 문에 문맥 이름을 추가해야 한다.
    val action: (Int) -> Unit = myFun@ {
        if (it < 2 || it > 3) return@myFun
        println(it)
    }

    // 람다가 인라인 될 경우에는 인라인된 코드를 둘러싸고 있는 함수에서 반환할 때 return 문을 사용할 수 있다.
    inlineForEach(intArrayOf(1, 2, 3, 4)){
        if (it < 2 || it > 3) return // main에서 반환됨 -> 1에서 종료됨
        println("inline: $it")
    }

    inlineForEach2(intArrayOf(1, 2, 3, 4)) {
        if (it < 2 || it > 3) return // run() 함수에서 반환됨
        println(it)
    }

    inlineForEach3(intArrayOf(1, 2, 3, 4)) {
        if (it < 2 || it > 3) //return => 에러
        println(it)
    }

}

// 고차 함수가 인라인이 될 수 있는 람다를 받는데,
// 이 고차 함수의 본문에서 람다를 직접 호출하지는 않고
// 지역 함수나 지역 클래스의 메서드 등 다른 문맥에서 간접적으로 호출할 수도 있다.
// 이런 경우에도 람다를 인라인할 수는 있지만,
// 인라인을 한 이후 람다에서 사용하는 return 문이 고차 함수를 호출 하는 쪽의 함수를 반환 시킬 수는 없다
// 인라인을 했음에도 람다의 return과 람다를 실행해주는 함수가 서로 다른 실행 스택 프레임을 차지하기 때문이다.
inline fun inlineForEach2(a: IntArray, action: (Int) -> Unit) = object {
    fun run() {
        for (n in a) {
            //action(n) // 따라서 이런식으로 함수 파라미터를 호출하는 일은 금지돼 있다.
        }
    }
}

// 이런 호출을 허용하려면 파라미터 앞에 crossinline 변경자를 붙여야 한다.
// 이 변경자는 함숫값을 인라인시키도록 남겨두는 대신 람다 안에서 비지역 return을 사용하지 못하게 막는 역할을 한다.
inline fun inlineForEach3(a: IntArray, crossinline action: (Int) -> Unit) = object {
    fun run() {
        for (n in a) {
            action(n)
        }
    }
}