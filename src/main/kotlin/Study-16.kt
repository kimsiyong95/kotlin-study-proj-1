/**
 * 코틀린에서 다양한 함수(FP)를 다루는 방법
 * 1. 확장함수
 * 2. infix(중위함수) 함수
 * 3. inline 함수
 * 4. 지역함수
 */

//1. 확장함수
//함수의 코드 자체는 클래스 밖에 있는데 클래스 안에 있는 멤버함수 처럼 호출하는 것
//확장함수는 원본클래스의 private, protected 멤버 접근이 안된다. 캡슐화가 깨지면 안되기 때문에
// String은 수신객체 타입
// 자바에 있는 Person 객체에 nextYearAge 멤버함수가 있고 코틀린에 있는 Person.nextYearAge 확장 함수가 있다면 멤버함수가 우선 호출
// 그렇기 떄문에 확장함수를 먼저 만들었지만 다른기능에서 멤버함수를 만들면 의도치않는 오류 발생
// 확장함수를 오버라이드해서 사용하면 타입을 부모로 지정해놓으면 부모에 있는 확장함수 사용, 자식을 타입으로 지정하면 자식 확장함수 사용

fun main(){
    val str = "ABC"
    println(str.lastChar())// 확장함수


    println(3 add2 4) // 중위 함수
    println(3.add3(4)) // inline 함수
}

fun String.lastChar(): Char{
    return this[this.length - 1] // 확장함수는 this(수신객체)를 통해 인스턴스에 접근 가능
}


//2. infix 함수(중위함수)
//함수를 호출하는 새로운 방법 = 변수.함수이름(argument) -> 변수 함수이름 argumnet 형식으로

infix fun Int.add2(other: Int): Int{
    return this + other
}

//3. inline 함수
//함수가 호출되는 대신 함수를 호출하는 지점에서 함수 본문을 그대로 복붙하고 싶은경우 사용
// 사용하는 이유 : 함수를 파라미터로 전달할 떄 오버헤드를 줄일수있음
// 하지만 성능측정과 함께 신중하게 사용되어야함!
inline fun Int.add3(other: Int): Int{
    return this + other
}

//4. 지역함수
// 함수안에 함수를 선언
// 하지만 depth 깊어지기도 하고 깔금하지않다.
// 차라리 person 객체 안에서 검증하는게 나아보임
// 실무에서도 딱히 사용하지 않는것 같아보임
fun createPerson(firstName: String, lastName: String): Person{
    fun validateName(name: String, fieldName: String){
        if(name.isEmpty()){
            throw java.lang.IllegalArgumentException("${fieldName}은 비어있을 수 없습니다! 현재 값 : $name")
        }
    }
    validateName(firstName, "firstName")
    validateName(lastName, "firstName")

    return Person(firstName)
}