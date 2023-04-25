package com.example.kotlinbasics

fun main(){

    // 이뮤터블
    val months = listOf(1,2,3,4,5)
    val anyTypes = listOf(1,2,3,true,false)
    println(anyTypes.size)

    for (item in anyTypes){
        when(item){
            is Int -> println("Int : $item")
            else -> println("bool : $item")
        }
    }

    // 뮤터블로 변경
    val additionalMotnths = months.toMutableList();
    val newMonths = arrayOf(6,7,8)
    val newMonths2 = listOf(9,10)
    additionalMotnths.addAll(newMonths)
    additionalMotnths.addAll(newMonths2)
    additionalMotnths.add(11)

    println(months)
    println(additionalMotnths)

    val days = mutableListOf<Int>(1,2,3,4,5)
    days.add(6)
    days.removeAt(3)
    val removeList = mutableListOf<Int>(2,3,4)
    days.removeAll(removeList)
    print(days)
}