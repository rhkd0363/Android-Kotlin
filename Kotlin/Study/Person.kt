package com.example.kotlinbasics

fun main() {
    val person = Person("person","default", 30)
    val kotlin = Person(firstName = "Kotilin")
    val oneTwo = Person("one", "two")

    person.doHobby()
    person.hobby = "Sing"
    person.doHobby()

    print("${person.age} ${kotlin.age}")

}

// 접근제한자 생성자 선택사항임
//class Person private constructor(firstName:String,lastName:String){
//class Person constructor(firstName:String,lastName:String){
class Person(firstName: String = "Studio", lastName: String = "Android") {
    // Member variables - Properties
    var firstName : String? = null
    var lastName : String? = null
    var age: Int? = null
    var hobby: String = "Dance"

    // Initializer Block
    init {
        this.firstName = firstName
        this.lastName  = lastName
        println("hi my name is $firstName")
    }

    //Member secondary Constructor  : this(firstName, lastName) 으로 생성자 호출
    constructor(firstName: String, lastName: String, age: Int) : this(firstName, lastName) {
        this.age = age
    }

    // Member Functions = Methods
    fun doHobby() {
        println("$firstName's hobby is $hobby!")
    }

}