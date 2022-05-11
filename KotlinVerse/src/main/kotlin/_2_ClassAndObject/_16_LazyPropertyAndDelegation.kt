package _2_ClassAndObject

import java.io.File
// [ 지연 계산 프로퍼티 ]
// 어떤 프로퍼티를 처음 읽을 때 까지 그 값에 대한 계산을 미루고 싶을때 사용
// lazy 프로퍼티는 일단 초기화된 다음에는 변경되지 않는다(val) // lateinit은 var이기 때문에 여러번 재 초기화 가능
// lazy 프로퍼티는 다중 스레드 환경에서도 값을 한 스레드 안에서만 계산하기 때문에 thread-safe한 특징을 가진다.
// lateinit과 달리 null을 허용한다.
val text2 by lazy {
    File("data.txt").readText()
}

// main() 함수에서 적절한 명령으로 프로퍼티 값을 읽기 전까지, lazy 프로퍼티의 값을 계산하지 않는다.
// 초기화 된 이후 프로퍼티의 값은 필드에 저장되고, 그 이후로는 프로퍼티 값을 읽을 때마다 저장된 값을 읽게 된다.
fun main(args: Array<String>) {

    when (val command = readLine() ?: return){
        "print data" -> println(text2)
        "exit" -> return
    }


    fun longComputation() {
        println("hi")
    }

    // 코틀린 1.1 부터 지역 변수에도 위임을 쓸 수 있게 됐다.
    val data by lazy { longComputation() }
    val name = args.firstOrNull() ?: return
    println("$name: $data") // name이 널이 아닐 때만 data에 접근할 수 있음

    // 위임은 구현이 다를 수 있기 때문에 커스텀 접근자로 정의된 프로퍼티처럼 다뤄진다.
    // 위임을 사용한 지역 변수의 경우에도 스마트 캐스트를 쓸 수 없다.
    val data2 by lazy { readLine() }
    if (data2 != null) {
        println("Length: ${data2!!.length}") // 스마트 캐스트를 사용할 수 없기 때문에 Not null 단언(!!)을 사용한다
    }

}

// 다음과 같이 정의하면 프로그램이 프로퍼티 값을 읽을 때마다 파일을 매번 다시 읽어온다.
val text3
    get() = File("data.txt").readText()

// 이 구문은 프로퍼티 처리에 필요한 데이터를 모아 유지하면서 읽기와 쓰기를 처리하는 위임 객체를 통해
// 프로퍼티를 구현하게 해주는 위임 프로퍼티(delegate property)라는 기능의 특별한 경우다.
val text4: String by lazy { File("data.txt").readText() }
