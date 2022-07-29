/**
 * 코틀린의 기타 내용
 * 1. Type Alias
 * 2. 구조 분해와 componentN 함수
 */



typealias FruFilter = (Fruit) -> Boolean

private fun filterFruits(fruits: List<Fruit>, filter: (Fruit) -> Boolean) {

}

private fun filterFruits2(fruits: List<Fruit>, filter: FruFilter) {

}


fun main(){
    val person = Person("김시용", 10)

    val (name, age) = person // 구조분해 문법

}
