
/**
 * 코틀린에서 다양한 클래스를 다루는 방법
 *
 * 1. Data Class (DTO)
 * 2. Enum Class
 * 3. Sealed Class, Sealed Interface
 */


fun main(){
    val dto1 = PersonDto("김시용", 100)
    val dto2 = PersonDto("김시용", 100)

    println(dto1==dto2) // true return
}


data class PersonDto ( // data 를 붙이면 equals, hashCode, toString을 만들어줌
     private val name: String,
     private val age: Int
)


fun handleCountry(country: Country){
    when(country){
        Country.KOREA -> ""
        Country.AMERICA -> ""
    }
}

enum class Country(
    private val code: String
){
    KOREA("KO"), // 각 각 싱글톤으로 단일 인스턴스를 가지고있다.
    AMERICA("US")
    ;

}

sealed class HyundaiCar(
    val name: String,
    val price: Long
)

class Avante : HyundaiCar("아반떼", 1_000L) // 컴파일 타임 때 하위 클래스의 타입을 모두 기억한다.
                                                        // when을 사용해서 is로 타입 체크할때 분기가 가능
class Sonata : HyundaiCar("소나타", 1_000L)

private fun handleCar(car: HyundaiCar){
    when(car){
        is Avante -> ""
        is Sonata -> ""
    }
}
