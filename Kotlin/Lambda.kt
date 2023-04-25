package com.example.kotlinbasics

fun main() {
    val sum: (Int, Int) -> Int = { a: Int, b: Int -> a + b }
    println(sum(10, 6))

    val sum2 = { a: Int, b: Int -> println(a + b) }
    sum2(4, 5)

    val introduce = { name: String, age: Int ->
        var age = age + 30
        "Name : $name , Age : $age"
    }

    print(introduce("Hong", 33))
}


