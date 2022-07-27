
/**
 * 코틀린에서 컬렉션을 다루는 방법
 */

fun main(){
    val array = arrayOf(100, 200)

    for (i in array.indices){
        println("${i} ${array[i]}")
    }

    val array2 = array.plus(300)

    for ((idx, value ) in array2.withIndex()){
        println("${idx} ${value}")
    }

    // 코틀린에서는 컬렉션은 불변, 가변을 정해줘야한다.
    // 불변은 값을 추가하거나 삭제 할 수 없다. 하지만 기존에 존재하는 객체의 값은 변경이 가능하다.
    // 가변은 값을 추가하거나 삭제가 가능하다.


    val numbers = listOf(100, 200) // 불변
    val numbers2 = mutableListOf(100, 200) // 가변

    //TIP
    //우선 불변리스트를 만들고 꼭 필요한 경우 가변 리스트로 바꾸자

    println(numbers[0])

    for(number in numbers){
        println(number)
    }

    for((idx, value) in numbers.withIndex()){
        println("${idx} ${value}")
    }

    val emptyList = emptyList<Int>() // emptyList를 선언할때는 타입을 지정해줘야함.

    printNumbers(emptyList()); // 하지만 메소드에서 추론이 가능하면 생략가능!


    val number3 = setOf(100,200) // 불변 set
    val number4 = mutableSetOf(100,200) // 가변 set


    val oldMap = mutableMapOf<Int, String>()
    oldMap.put(1, "MONDAY")
    oldMap[1] = "MONDAY"


    val mapOf = mapOf(1 to "MONDAY", 2 to "TUESDAY")

    for(key in oldMap.keys){
        println(key)
        println(oldMap[key])
    }

    for((key, value) in oldMap.entries){
        println(key)
        println(value)
    }
    
    
    //List<Int?> : 리스트에 null이 들어갈수있지만, 리스트는 절대 null이 아님
    //List<Int>? : 리스트에는 null이 들어갈수없지만, 리스트는 null일수도있음
    //List<Int?>? : 리스트에 null이 들어갈수도있고, 리스트가 null일수도있음

    // JAVA와 함께 쓸떄 주의할점
    // 기본적으로 자바는 읽기전용 컬렉션과 변경가능 컬렉션을 구분하지 않는다.
    // 자바에서 코틀린에있는 불변리스트 가져와서 값을 추가하고 코틀린에 되돌려주면 오동작이 일어남 
    // 또는 코틀린에 non-nullable 리스트를 자바에서 null을 추가하면 오동작이 일어남

    // 해결방법은 코틀린쪽에서 방어로직을 짜던지 아니면 Collections.unmodifiableMap(), unmodifiableList() 활용하면 변경자체를 막을수있음

    // 반대로 코틀린에서 자바 코드를 사용할떄는 플랫폼 타입을 신경써야함
    // JAVA : List<Integer> << 를 코틀린에서 가져다쓰면  List<Int?>,List<Int>?, List<Int?>? 인지 인지를 못함
    // 해결방법은 Java코드를 보며 맥락을 확인하고 가져오는 지점에 wrapping한다.

}

private fun printNumbers(numbers: List<Int>){

}
