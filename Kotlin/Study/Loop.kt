package com.example.kotlinbasics

fun main(){
    // while
    var x = 1
    while(x < 10){
        println("$x")
        x++
    }
    println("x : $x while done")

    //do while
    do {
        println(x)
        x--
    }while (x > 1)
        println("x : $x do while done")

    //for
    for (num in 1..10){
        print("$num ")
    }

    for (i in 1 until 10 step 3){ //same as => for(i in 10.until(10))
        print("$i ")
    }
    // step을 써서 증감 정도를 설정 가능
    for (i in 10 downTo  1 step 2){ //same as => for(i in 10.downTo(1).step(2))
        print("$i ")
    }

    // continue break
    for(i in 1..10){
        if(i == 5){
//            break
            continue
        }
        print(i)
    }
}