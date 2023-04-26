package com.example.kotlinbasics

import java.time.Clock

fun main() {
    var height1 = 170
    var height2 = 180
    //if 문
    if (height1 > height2) {
        println("height1")
    } else if (height1 == height2) {
        println("equal")
    } else {
        println("height2")
    }

    // if문을 식으로 사용 가능
    val diff = if (height1 > height2) {
        height1 - height2
    } else {
        height2 - height1
    }
    println(diff)

    // when 은 switch문을 대체한 것, when도 식으로 사용 가능
    var season = 3
    when (season) {
        1 -> println("spring")
        2 -> println("summer")
        3 -> {
            println("fall")
            println("autumn")
        }
        4 -> println("winter")
        else -> println("invalid")
    }

    var month = 3
    when (month) {
        in 3..5 -> println("spring")
        in 6..8 -> println("summer")
//        in 12 downTo 2 ->
        12,1,2 -> println("winter")
        else -> println("invalid")
    }
    var age = 20
    when(age){
        !in 0..20 -> println("invalid")
        in 6..8 -> println("a")
        in 9..11 -> println("b")
        else -> println("c")
    }

    // is는 특정 값 또는 타입인지 확인
    var x: Any = 13.37
    when(x){
        !is Int -> println("$x is Int")
        is Double -> println("$x is Double")
        is String -> println("$x is String")
        else -> print("invalid")
    }
}
