package com.example.kotlinbasics

fun main(){

    var name:String = "Kotlin"
//    name = null => Compilation Error

    // ?를 사용해 Nullable 설정을 해줄 수 있다
    var nullableName : String? = "Kotlin"
//    nullableName = null

    var len = name.length
    var len2 = nullableName?.length
    // 위의 코드와 같음
    /*
    if(nullableName != null){
        var len2 = nullableName.length
    }else{
        null
    }
    */
    print(nullableName?.toUpperCase())
    // 이런식으로도 사용 가능하다..
    nullableName?.let{ println(it.length) }

    // 엘비스(Elvis) 연산자, null이면 "Guest" 출력
    val newName = nullableName ?: "Guest"

//    nullableName = null
    // non-null 변수에 값이 있다고 확신할 때 사용
    nullableName!!.toLowerCase()
}