package BasicGrammer

import kotlin.random.Random

fun main() {

    // for, while 문은 자바와 사용법이 같다
    val a = IntArray(10) {it*it}
    var sum = 0
    for (x in a) {
        sum += x
    }
    println("Sum: $sum")
    // 코틀린에는 선언, 초기화, 검사 및 갱신으로 구성되는 일반 자바 for문을 사용 할 수 없다.
//    for(int i =1; i<10 ; i++){
//    }
    // 이런 루프를 사용하기 위해서는 범위와 진행을 사용하는 for 문이나 while문으로 표현해야한다.


    // 자바에서는 문자열의 각 문자에 대해 루프를 직접 수행 할 수 없다.
    // 수 범위에 대한 루프는 다음과 같이 수행할 수 있다.
    for (i in 0..a.lastIndex step 2) {
        a[i] *= 2
    }


    //return과 마찬가지로 코틀린의 break,continue 문도 Nothing 타입의 식으로 쓸 수 있다.
    // 하지만 이런 기능을 남용하면 코드를 이해하기 어려워질 수 있다.
    val num = Random.nextInt(1,101)
    while (true) {
        val guess = readLine()!!.toInt()
        val message =
            if (guess < num) "Too Small"
            else if (guess > num) "Too big"
            else break
        println(message)
    }


    // 내포된 루프와 레이블
    // for문의 안에서 더 바깥쪽의 제어 흐름을 변경하고 싶을때, 레이블을 사용해 제어할 수 있다.
    fun indexOf(subarray: IntArray, array: IntArray):Int{
        outerLoop@ for (i in array.indices) {
            for (j in subarray.indices) {
                if (subarray[j] != array[i+j]) continue@outerLoop

            }
            return i
        }
        return -1
    }


    // 꼬리 재귀 함수
    // 꼬리 재귀는 '재귀 호출이 끝나면 아무 일도 하지 않고 결과만 바로 반환되도록 하는' 방법이다.
    // 코틀린에서는 함수에 tailrec을 붙이면 컴파일러가 재귀 함수를 비재귀적인 코드로 자동으로 변환해준다.
    // 꼬리 재귀가 아닌 함수에 tailrec을 붙이면 컴파일러 경고가 표시된다.
    tailrec fun binIndexOf(
        x: Int,
        array: IntArray,
        from: Int = 0,
        to: Int = array.size
    ): Int {
        if (from == to) return -1
        val midIndex = (from + to - 1)
        val mid = array[midIndex]
        return when {
            mid < x -> binIndexOf(x, array, midIndex + 1, to)
            mid > x -> binIndexOf(x, array, from, midIndex)
            else -> midIndex
        }

    }

}
