/**
 * 코틀린에서 람다를 다루는 방법
 */


class Fruit(
    val name: String,
    val price: Int,
    val id: Long
)


fun main(){
    val fruits = listOf(
        Fruit("사과", 1000, 1),
        Fruit("바나나", 2000, 2),
        Fruit("바나나", 3000,3),
        Fruit("바나나", 4000,4),
        Fruit("바나나", 5000,5),
        Fruit("수박", 6000,6),
        Fruit("수박", 7000,7),
        Fruit("수박", 8000,8),
        Fruit("사과", 9000,9),
    )

    val isApple: (Fruit) -> Boolean = fun(fruit: Fruit): Boolean{ // 이름 없는 함수 람다
        return fruit.name == "사과"
    }
    
    // (파라미터타입) -> 반환타입
    val isApple2: (Fruit) -> Boolean = {fruit: Fruit -> fruit.name == "사과"} // 자주쓰는 표현법
    val isApple3 = {fruit: Fruit -> fruit.name == "사과"} // 자주쓰는 표현법
                                                        // 람다는 마지막줄이 반환값임

    println(isApple(fruits[0]))
    println(isApple.invoke(fruits[0]))
    println(isApple2(fruits[0]))
    println(isApple2.invoke(fruits[0]))

    filterFruits(fruits, isApple2)
    filterFruits(fruits) { it.name == "사과"} // 소괄호에서 중괄호를 빼면 마지막 파라미터로 인식
                                            // 파라미터가 1개일 경우 it으로 대체 가능 
}

private fun filterFruits(fruits: List<Fruit>, filter: (Fruit) -> Boolean): List<Fruit> {
    val results = mutableListOf<Fruit>()

    for(fruit in fruits){
        if(filter(fruit)){
            results.add(fruit)
        }
    }
    return results
}
