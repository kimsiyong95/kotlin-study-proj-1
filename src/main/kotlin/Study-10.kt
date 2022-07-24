/**
 * 코틀린에서 상속을 다루는 방법
 */

// 상위 클래스를 설계할 때 생성자 또는 초기화 블록에 사용되는 프로퍼티에는 open을 피해야한다.

abstract class Animal(
    protected val species: String,
    protected open val legCount: Int
){
    abstract fun move()
}

class Cat(species: String)
    : Animal(species, 4) { // : 한칸띄고 상속받을 클래스명 extends이 아님!

    override fun move() {
        println("고양이 걷기")
    }
}

class Penguin(species: String)
    : Animal(species,2), Swimable, Flyable{ // implement도 : 사용한다.
    
    private val wingCount: Int = 2

    override fun move() {
        println("펭퀸 걷기")
    }

    override val legCount: Int
        get() = super.legCount + this.wingCount

    override fun act() {
        super<Swimable>.act()
        super<Flyable>.act()
    }
}

interface Flyable {
    fun act(){
        println("파닥 파닥")
    }
}

interface Swimable{
    fun act(){
        println("어푸 어푸")
    }
}


