/**
 * 코틀린에서 Type을 다루는 방법
 */

fun main(){
    val number1 = 3
    val number2: Long = number1.toLong() // java에서는 암묵적으로 형 변환이 되지만 코틀린에서는 명시적으로 해줘야함


    val number3: Int? = 3
    val number4: Long = number3?.toLong() ?: 0L


    val person = Person("김시용")

    println("내이름은 ${person.name}")
    
    val name = "김시용2"
    
    println("내이름은 $name") // $name 보다는 ${person.name} 이런식으로의 코드가 가독성이 더 높음

    val str = """
        AAA
        BBB
        CCC
        ${person.name}
    """.trimIndent()


    val str2 = "ABC"
    println(str[0])

}

fun printNameIfPerson(obj : Any){
    if(obj is Person){ // is >> instanceOf is의 반대 !is
        println(obj.name) // 스마트캐스트  << is로 타입 체크를 했기때문에 알아서 obj에서도 객체 변수를 꺼내기가 가능
    }
}

fun printNameIfPersonNull(obj : Any?){ // java Object == kotlin Any
    val person = obj as? Person
    println(person?.name)
}