/**
 * 코틀린 기본 변수 사용법
 */
fun main(){
    var number1 = 10L
    number1 = 5L


    val number2 = 20
    //number2 = 30  --> val 은 불변이라 수정이 불가

    var number3 : Long  = 20L // 타입을 지정하고싶으면 따로 지정해줘도 됨

    // 간단한 TIP
    //모든 변수는 우선 val 로 만들고 필요한 경우  var로 변경
    val number4 : Long // 불변으로 선언 후 최초 값 넣기 가능
    number4 = 20L


    var number5 : Long? // 기본적으로 코틀린은 변수는 null 값을 받을 수 없어 ?를 넣음으로써 null 일수도있다는것을 표시해줘야함.
    number5=null


    val person = Person("김시용"); // 객체를 인스턴스화 할때 new 를 쓰면 안된다.

}
