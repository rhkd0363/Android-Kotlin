package com.example.kotlinbasics

fun main(){
    myFunction()

    val result = addFunction(3,6)
    println(result)
}

// Function
fun myFunction(){
    println("It's MyFunction!")
}

// fun funName(paramName: paramType ...) : return type {}
fun addFunction(a : Int, b: Int) :Int{
    return a+b
}

// Method - a Method is a Function within a Class