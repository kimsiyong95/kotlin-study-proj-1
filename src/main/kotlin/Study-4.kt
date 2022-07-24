import java.util.Objects

/**
 * 코틀린에서 연산자를 다루는 방법
 */

class KtMoney(money : Long){


    val money : Long

    init {
        this.money = money
    }

    operator fun compareTo(money2: KtMoney): Int {
        return this.money.compareTo(money2.money)
    }

    override fun equals(o: Any?): Boolean {
        if(o == null || o !is KtMoney) return false

        val javaMoney = o as KtMoney

        return this.money == javaMoney.money
    }

    override fun hashCode(): Int {
        return Objects.hash(money)
    }

}


fun main(){
    val money1 = KtMoney(2_000L)
    val money2 = KtMoney(1_000L)


    if(money1 > money2){ // >, < 비교 연산자는 comapreTo를 자동으로 호출
        println("money1이 더 큼")
    }



    val money4 = KtMoney(2_000L)
    val money5 = money4
    val money6 = KtMoney(1_000L)
    
    
    println(money4 === money5) // 주소 확인 동일성 체크

    println(money2 == money6) // 동등성 체크
    
    
    // 자바 와같이 && || 연산 사용
}