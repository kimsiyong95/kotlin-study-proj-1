import java.io.BufferedReader
import java.io.File
import java.io.FileReader

/**
 * 코틀린에서 예외를 다루는 방법
 */

fun main(){
    
}

fun parseIntOrThorw(str: String): Int {
    try {
        return str.toInt()
    }catch (e: java.lang.NumberFormatException){
        throw java.lang.IllegalArgumentException("숫자가 아닙니다.")
    }
}
fun parseIntOrThorw2(str: String): Int? {
    return try {
        str.toInt()
    }catch (e: java.lang.NumberFormatException){
        null
    }
}


fun readFile(){ // IOException 처리를 따로 안해도된다. 코틀린의 장점 : UncheckException
    val currentFile = File(".")
    val file = File(currentFile.absolutePath + "/a.txt")
    val reader = BufferedReader(FileReader(file))
    println(reader.readLine())
    reader.close()

}

fun readFile(path : String){ // 코틀린에서는 try with resources 삭제되고 use 함수 사용 
    BufferedReader(FileReader(path)).use {reader ->
        println(reader.readLine())
    }
}

