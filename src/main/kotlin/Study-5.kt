/**
 * 코틀린에서 제어문을 다루는 방법
 */

fun validateScoreIsNotNegative(score : Int){
    if(score < 0){
        throw IllegalArgumentException("${score }는 0보다 작을 수 없습니다.")
    }
}

fun getPassOrFail(score : Int): String {
    return if(score >= 50){
        "P"
    }else{
        "F"
    }
}


fun getPassOrFail2(score : Int): String {
    return if(score in 0..100){ // score >= 0 && 100 <= score 같은 의미
         "P"
    }else{
        "F"
    }
}

fun getGradeWithSwitch(score: Int) : String{
    return when( score / 10){  // java : switch -> kotlin : whwen
        9  -> "A"
        else -> "D"
    }
}

fun getGradeWithSwitch2(score: Int) : String{
    return when( score / 10){  // java : switch -> kotlin : whwen
        in 90..99 ->"A"
        in 80..89 ->"B"
        in 70..79 ->"C"
        else -> "D"
    }
}

fun judgeNumber(number : Int){
    when(number){
        1, 0, -1 -> println("1또는 0 또는 -1 입니다.") // 1||0||-1 의미와 같다.
        else -> println("그 외입니다.")
    }
}
fun judgeNumber2(number : Int){
    when {
        number == 0 -> println("숫자는 0")
        number % 2 == 0-> println("짝수")
        else -> println("홀수")
    }
}

