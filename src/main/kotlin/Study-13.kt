
/**
 * 코틀린에서 중첩클래스를 다루는 방법
 */


class House (
    private var address: String,
    private var libingRoom: LivingRoom
){
    inner class LivingRoom( // 권장되지 않는 클래스 안의 클래스
                            // 기본적으로 바깥 클래스를 참조하지 않기 때문에 바깥 클래스를 참조하기 위해서는 inner를 추가한 후 this@바깥클래스명.변수명으로 사용해야함
        private var area: Double
    ){
        val address: String
            get() = this@House.address
    }
}