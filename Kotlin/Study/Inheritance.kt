package com.example.kotlinbasics

// open 클래스여야 상속이 가능하다.
// 코틀린의 모든 클래스는 자동으로 최종값이므로 상속을 위해서는 open 설정
open class Fruit(val name:String, val brand: String){
    open var score : Double = 0.0

    fun changeScore(score: Double){
        if(score > 0)
            this.score = score
    }

    open fun eatFruit(){
        println("Yummy!")
    }

    // override 할 수 있다
    override fun toString(): String {
        return "$name is So Yummy!"
    }

}

// sealed 를 사용하여 상속을 막을 수 있다.
// sealed 를 하면 서브 클래스를 객체로 바꿔버린다..
class Apple(name: String, brand: String, color: String) : Fruit(name, brand){
    // override 할 수 있다
    override var score = 30.0

    override fun eatFruit() {
        println("$name Yummy! and Score is $score")
    }
}

//class redApple : Apple(){
//
//}

fun main(){
    var myFruit = Fruit("오이", "음성")
    var myApple = Apple("맛있는사과", "문경", "red")

    myFruit.changeScore(2.0)
    myFruit.eatFruit()
    myApple.eatFruit()
    myApple.changeScore(8.0)
    print(myApple.toString())

}
