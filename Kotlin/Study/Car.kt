package com.example.kotlinbasics

fun main() {
    var myCar = Car()
    print(myCar.myBrand)
    myCar.maxSpeed = 200
    print(myCar.maxSpeed)
    print(myCar.myModel)
//    myCar.myModel = "M3"

}


class Car() {
    // lateinit 은 바로 초기화하지 않고 init{}에서 처리해줄 때 사용
    lateinit var owner: String

    val myBrand: String = "BMW"
        // Custom getter
        get() {
            return field.toLowerCase()
        }

    var maxSpeed: Int = 300
        // 아래와 같은 코드가 자동으로 생성되는 것이다..
        // field는 게터와 세터 메서드 안에서 프로퍼티 참조를 도와주는 녀석..
        get() = field
        // 값은 전달받은.. 초기화하려는 값
        set(value) {
            field = value
        }

    var myModel: String = "M5"
        private set

    init {
        this.myModel = "M3"
        this.owner = "Frank"
    }
}