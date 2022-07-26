/**
 * 코틀린에서 Object를 다루는 방법
 */


fun main(){

}


class InnerPerson private constructor(
    var name : String,
    var age: Int
){
    
    companion object  Factory : Log{ //  companion object : java의 static 와 비슷한 개념
                                     //  java와 다른점은 Factory라는 이름을 붙일수있고 Log라는 인터페이스를 구현할수있다.
                                     //  java쪽에서 InnerPerson.Factory.newBaby로 접근 가능

        private const val MIN_AGE = 1 // const를 붙이게 되면 complie 당시에 값이 할당 안붙이면 runtime 시 값을 할당, const는 상수에 붙여야함
        fun newBaby(name : String) :InnerPerson{ // 코틀린 정적팩토리메소드
            return InnerPerson(name, MIN_AGE);
        }

        override fun log() {
            println("나는 Person 클래스의 동행객체 Factory에요")
        }
    }
}

class InnerPerson2 private constructor(
    var name : String,
    var age: Int
){
    
    
    companion object { 
        

        private const val MIN_AGE = 1
        
        
        @JvmStatic  // java쪽에서 InnerPerson2.newBaby로 바로 접근 가능하게 하는 어노테이션 
                    // 어노테이션을 안붙이면 InnerPerson2.Companion.newBaby로 접근 해야함
        fun newBaby(name : String) :InnerPerson2{ 
            return InnerPerson2(name, MIN_AGE);
        }
        
    }
}

interface Log {
    fun log()
}

// 코틀린의 싱글톤
object Singleton{
    var a: Int = 0;
}




