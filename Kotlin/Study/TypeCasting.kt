package com.example.kotlinbasics

fun main() {
    // List
    val stringList: List<String> = listOf(
        "Good", "Awesome", "Apple", "Compose"
    )
    val mixedTypeList: List<Any> = listOf(
        "Great", 12, 44, "Good", 20.23, "Ksw"
    )

    for (value in mixedTypeList) {
        if (value is Int) {
            println("Integer : `$value`")
        } else {
            println("Not Integer : $value")
        }
    }

    for (value in mixedTypeList) {
        when (value) {
            is Int -> println("Integer : `$value`")
            else -> println("Not Integer : `$value`")
        }
    }

    //SMART CAST
    val obj1: Any = "I Have a Dream"
    if(obj1 !is String){
        println("Not a String")
    }else{
        println("String : $obj1")
    }

    //Explicit (unsafe) Castring using the "as" keyword
    val str1: String = obj1 as String
    println(str1.length)

//    val obj2:Any = 1332
//    val str2 : String = obj2 as String //exception
//    println(str2)

    //Explicit (safe) casting using the "as?" keyword
    val obj3: Any = 1332
    val str3: String? = obj3 as? String //Works
    println(str3) //prints null
}
