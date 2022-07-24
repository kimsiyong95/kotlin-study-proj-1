import com.sun.org.apache.xpath.internal.operations.Bool

/**
 * 코틀린에서 접근 제어를 다루는 방법
 */

// 코틀린에서는 패키지 개념이 없다.
// private 같이 클래스내
// internal 같은 모듈
// protected 나 또는 하위 클래스
// public 전부

fun isDirectoryPath(path: String): Boolean{
    return path.endsWith("/")
}

class Car(
    internal val name: String,
    private var owner: String,
    _price: Int
){
    var price = _price
        private set // setter에만 가시성 부여
}