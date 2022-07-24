/**
 * 코틀린에서 함수를 다루는 방법
 */

// fun 앞에 접근제어자 생략시 public 임

fun main() {
    repeat("Heelo")
    repeat("Heelo",5)
    repeat("Heelo",5,true)
    repeat("Heelo", useNewLine = false) // 매개변수 이름을 통해 직접 지정가능, Builder의 장점과 유사함
    repeat(str="Heelo", useNewLine = false) // 지금 코드는 코틀린에서만 작동 자바 함수는 name argument 사용 불가


    printAll("A", "B","C")

    val arr = arrayOf("A", "B", "C")
    printAll(*arr) // *(스프레드연산자)은 배열안에 있는 값을 하나씩 꺼내준다 이런 의미
    
}


fun max(a: Int, b: Int) = if(a > b) a else b


fun repeat(str: String, num: Int = 3, useNewLine: Boolean = true){ // default Parameter 자바로 치면 오버로딩을 여러개 만들 필요 없이 기본값 설정으로 인해 함수 하나로 가능
    for (i in 1..num){
        if(useNewLine){
            println(str)
        }else{
            print(str)
        }
    }
}

fun printAll(vararg strings: String){ // 자바의 ...을 코틀린에서는 vararg를 사용
    for(str in strings){
        println(str)
    }
}
