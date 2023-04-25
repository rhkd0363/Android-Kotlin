package com.example.kotlinbasics

fun main(){
    val myArrayList = ArrayList<Double>()

    myArrayList.add(12.22)
    myArrayList.add(15.22)
    myArrayList.add(11.22)
    myArrayList.add(13.22)
    myArrayList.add(14.22)
    var total = 0.0

    for(num in myArrayList){
        total += num
    }

    val result = total / myArrayList.size

    println(result)
}