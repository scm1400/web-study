package Class_Object

// 내포된 클래스(Nested Class)
// 코틀린 클래스는 다른 클래스도 멤버로 가질 수 있다.
class Person9(val id: Id, val age: Int) {

    class Id(val firstName: String, val familyName: String)

    // 자바와 달리, 바깥쪽 클래스에서 내포된 클래스의 private 멤버에 접근할 수 없다.
    class Id2(private val firstName: String, private val familyName: String)

    // inner를 붙이면 자신을 둘러싼 외부 클래스의 현재 인스턴스에 접근할 수 있다.
    inner class Possession(val description: String){
        fun showOwner() = println(fullName())

        // 내부 클래스 본문에서 외부 클래스 인스턴스를 가리켜야 한다면
        // 한정시킨(qualified) this 식을 사용해야 한다.
        fun getOwner() = this@Person9
    }

    // inner를 안붙이면 fullName()에 접근할 수 없음.
//    class Possession2(val description: String){
//        fun showOwner() = println(fullName())
//    }

    // this를 생략할 수 있다.
    val myWallet2 = this.Possession("Wallet")
    val myWallet = Possession("Wallet")


    private fun fullName() = "${id.firstName} ${id.familyName}"

    fun showMe() = println("${id.firstName} ${id.familyName}, $age")
}

fun main() {
    // Nested Class 참조
    val id = Person9.Id("Earl", "Gray")
    val person = Person9(id, 25)
    person.showMe()

    // 내부 클래스 생성자를 호출 할 때 외부 클래스 인스턴스를 지정해야 한다.
    val wallet = person.Possession("Wallet")
    wallet.showOwner()

}