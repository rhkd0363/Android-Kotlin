package com.example.kotlinbasics

fun main() {
//    val numbers: IntArray = intArrayOf(1, 2, 3, 4, 5)
//    val numbers = intArrayOf(1, 2, 3, 4, 5)
    val numbers = arrayOf(1, 2, 3, 4, 5)

    println(numbers.contentToString())

    for(element in numbers){
        print("$element ")
    }

    println(numbers[4])

    val fruits = arrayOf(MyFruit("apple",20.0),MyFruit("banana",15.0))

    // indices를 통해 index 정보를 얻을 수 있음
    for (index in fruits.indices){
        println("${fruits[index].name} is in index $index")
    }

}

data class MyFruit(val name:String, val price:Double)