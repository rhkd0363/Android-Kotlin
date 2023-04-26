package com.example.kotlinbasics

fun main() {
    // TODO : kotlin variable study
    /* 주석 */

    // immutable variable
    val yourName = "Android"
    println("Hello " + yourName)

    // mutable variable
    var myName = "Studio"
    println("Hello " + myName)
    myName = "Kotlin"
    println("Hello " + myName)

    // type string
    val myString = "Hello"

    // Integer Types : Byte(8bit), Short (16bit), Int (32bit), Long (64bit)
    // _ 를 통해 가독성을 높일 수 있다.
    // 콜론 뒤에 타입을 지정하여 선언할 수 있다.
    val myByte: Byte = 127
    val myShort: Short = 125
    val myInt: Int = 123_123_123
    val myLong: Long = 12_039_812_302_123_564_12

    // type inference finds out the type from context
    // 타입을 지정하지 않아도 코틀린이 알아서 타입을 지정해주기도 한다.(타입 추론)
    val myNewInt = 123412

    // Floating Point number Types : Float(32bit) , Double (64bit)
    val myFloat: Float = 13.33F
    val myDouble: Double = 3.2123342343

    println(
        "My String : $myString \n" +
                "My Byte : $myByte \n" +
                "My Short : $myShort \n" +
                "My Int : $myInt \n" +
                "My Long : $myLong \n" +
                "My Float : $myFloat \n" +
                "My Double : $myDouble"
    )

    // Booleans type
    var myBoolean : Boolean = true
    myBoolean = false

    // Characters
    val myChar : Char = 'A'

    // Strings
    val myStr = "Hello World"
    val firstChatInString = myStr[0]
    val lastChatInString = myStr[myStr.length - 1]

    println(firstChatInString +""+ lastChatInString)

    // 보간법
    println("My String: $myString and the length of MyString is ${myString.length}");

}