/**
 * 코틀린에서 컬렉션을 함수형으로 다루는 방법
 */



private fun filterFruits(fruits: List<Fruit>, filter: (Fruit) -> Boolean): List<Fruit> {
    return fruits.filter(filter)
}


fun main(){
    val fruits: List<Fruit> = arrayListOf();
    val fruitSort = fruits.sortedBy {fruit -> fruit.price } // 가격 기준 오름차순 정렬
    val fruitSort2 = fruits.sortedByDescending {fruit -> fruit.price } // 가격 기준 내림차순 정렬
    val distinctFruit = fruits.distinctBy { fruit -> fruit.name } // 중복제거
    val firstFruit = fruits.first() // 무조건 첫번쨰 가져오기  첫번째가 없으면 exception 터짐
    val firstOrNullFruit = fruits.firstOrNull() // 첫번째를 가져오지만 없으면 null 가져옴
    val lastFruit = fruits.last() // 마지막 가져오기 없으면 exception
    val lastOrNullFruit = fruits.lastOrNull() // 마지막 가져오기 없으면 null 가져오기
    
    
    val isAllApple = fruits.all { fruit -> fruit.name == "사과" } // 전부 사과이면 true 그렇지 않으면 false
    val isNoneApple = fruits.none { fruit -> fruit.name == "사과" } // 전부 사과가 아니면 true 그렇지 않으면 false
    val isAnyApple = fruits.any {fruit -> fruit.price > 10000 } // 하나라도 조건이 맞으면 true 그렇지 않으면 false

    val map: Map<String, List<Fruit>> = fruits.groupBy { fruits -> fruits.name } // List to Map, 과일이름이 key값이 되고 과일들이 전부 리스트로 들어감
    val map2: Map<Long, Fruit> = fruits.associateBy { fruits -> fruits.id } // id기준으로 전부 map으로 변경
    val map3: Map<String, List<Int>> = fruits.groupBy({ fruits -> fruits.name}, { fruits -> fruits.price  })
    val map4: Map<Long, Int> = fruits.associateBy ({ fruits -> fruits.id }, {fruits -> fruits.price })
    val map5: Map<String, List<Fruit>> = fruits.groupBy { fruit -> fruit.name }.filter { (key, value) -> key == "사과" }

}

