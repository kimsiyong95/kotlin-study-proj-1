/**
 * 코틀린에서 클래스를 다루는 방법
 */

class Persson1 (name: String = "김시용", age: Int = 10){
    
    // 코틀린은 getter setter를 자동으로 만듬
    val name: String = name
        get() = field.uppercase() // 무한루프를 막기위한 field 사용

    var age: Int = age

    var setName = name
        set(value){
            field = value.uppercase()
        }


    init {
        if(age <= 0){
            throw IllegalArgumentException("나이는 0 보다 작을 수 없습니다.")
        }
    }
    
}


class Person2 (
    val name: String ,
    var age: Int
){
    init {
        if(age <= 0){
            throw IllegalArgumentException("나이는 0 보다 작을 수 없습니다.")
        }
    }


    val upperCaseName: String
        get() = this.name.uppercase()


    constructor(name: String): this(name, 1)

    constructor(): this("김시용"){

        println("부 생성자")
    }

    fun isAdult(): Boolean{
        return this.age >= 20
    }

    val isAdult2: Boolean
        get() = this.age >= 20
        //get() { return this.age >= 20}

}

fun main(){
    val person = Persson1("김시용", 0)
    val person2 = Person2("김시용", 100)

    person.age = 5

    println(person.age)

    val person3 = Person2("김시용") // constructor를 사용해서 생성자 추가 가능
    val person4 = Persson1(name = "김시용")
}

