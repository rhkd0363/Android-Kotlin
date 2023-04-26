package com.example.kotlinbasics

fun main(){
    val fruits = setOf("apple","1","2","banana","apple","Apple")
    print(fruits.toSortedSet()) // 정렬

    val newFrutis = fruits.toMutableList()
    newFrutis.add("Melon")
    newFrutis.add("Pear")
    print(newFrutis.elementAt(4))

    val daysOfTheWeek = mapOf(1 to "Monday",2 to "Tuesday",3 to "Wednesday")
    print(daysOfTheWeek[2])
    for(key in daysOfTheWeek.keys){
        println(key)
    }
    for(value in daysOfTheWeek.values){
        println(value)
    }
    val  myFruits = mapOf("Apple" to MyFruit("apple",1.0),2 to MyFruit("banana",2.3))
    for(key in myFruits.keys){
        println(key)
    }
    for(value in myFruits.values){
        println(value)
    }

    print(daysOfTheWeek.toSortedMap())


}