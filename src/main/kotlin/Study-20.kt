/**
 * 코틀린의 scope function
 */



fun printPerson(person: Person?){
    // let은 람다의 결과를 반환
    person?.let { // scope function 일시적 영역 생성
        println(person.name)
    }

    if(person!=null){
        println(person.name)
    }


    //run 람다의 결과를 반환 age가 반환됨
    val value1 = person?.run {
        this.age
    }

    //also 객체 그 자체가 반환
    val value2 = person?.also {
        it.age
    }

    //apply 객체 그 자체가 반환
    val value3 = person?.apply {
        this.age
    }

    //with
    with(person){
        this?.let { println(it.age) }
    }


}
