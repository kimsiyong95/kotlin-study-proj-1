
/**
 * 코틀린에서 null을 다루는 방법
 */

fun main(){
    val str: String? = null
    println(str?.length ?:0) // str?.length << 이거는 safe-call이라 부르고 ?:(엘비스연산자) 를 통해 앞에가 null이면 0 호출

}

fun startsWithA1(str : String?): Boolean{
    return str?.startsWith("A")
        ?: throw java.lang.IllegalArgumentException("null")

}

fun startsWithA2(str: String?): Boolean?{
    return str?.startsWith("A")
}

fun startsWithA3(str: String?) : Boolean{
    return str?.startsWith("A") ?: false
}

fun startWith(str : String? ) : Boolean {
    return str!!.startsWith("A") // !! << 무조건 null 이 아니다 라는 의미
}