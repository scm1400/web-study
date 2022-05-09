package Class_Object

// 널이 될 수 있는 값을 처리하는 직접정인 방법: 조건문을 사용해 null과 비교
fun isLetterString2(s: String?): Boolean{

    /** 스마트 캐스트(Smart Cast)
     * 이 가지에서는 확실히 값이 null 이고 나머지 가지는 확실히 null이 아니라는 정보를 사용해
     * 컴파일러는 null이 될수 있는 값을 null이 될 수 없는 값으로 타입 변환한다.
     * IntelliJ 에서는 스마트 캐스트된 변수를 특별히 강조해준다. 마우스를 갖다대면 세분화된 타입을 볼 수 있다.
     */
    if (s == null) return false // null에 대한 검사 코드가 없으면 다른 가지에서 컴파일 오류가 발생한다.
    if (s.isEmpty()) return false
    for (ch in s) {
        if (!ch.isLetter()) return false
    }
    return true
}
// when, &&, || 연산에서도 smart cast가 작동한다.
fun isSingleChar(s: String?) = s != null && s.length ==1

fun main() {

}