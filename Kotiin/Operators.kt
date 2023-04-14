package com.example.kotlinbasics

import kotlin.math.log

fun main() {

    // Arithmetic Operators (+, -, *, /, %)
    var result = 5 + 4
    println(
        "${result + 2}, " + "${result - 2}, " + "${result * 2}, " + "${result / 2}, " + "${result % 2}"
    )

    // Comparison Operators (==, !=, <, >, <=, >=)
    val isEqualizer = 5 == 3
    println(isEqualizer)
    println("${5===3}, ${5!==5}, ${5>3}, ${5<3}, ${5>=5}")

    // Assignment Operators ( +=, -=, *=, /=, %=)
    var myNum = 5
    myNum -= 3
    myNum += 3
    myNum *= 3
    myNum /= 3
    myNum %= 3
    println(myNum)
}
