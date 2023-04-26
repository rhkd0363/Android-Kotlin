package com.example.kotlinbasics

// 파라미터 한개 이상 꼭 입력해야 한다..
// 파라미터는 var 또는 val로 넣어야 한다..
// 데이터 클래스는 abstract, open, sealed, inner 클래스일 수 없다
data class User(val id:Long, var name:String)

fun main(){
    val user = User(1,"kotlin")

//    val name = user.name
//    print(name)

    user.name = "KAKAKA"
    val user2 = User(1,"KAKAKA")

    println(user.equals(user2))
    println(user == user2)

    println(user) //toString 됨

    // 카피할 수 있고 원하는 속성만 바꿀 수 있음
    val updateUser = user.copy(name="Ronaldo")

    println(updateUser)

    println(updateUser.component1()) //print id
    println(updateUser.component2()) //print name

    val (id,name) = updateUser
    println("$id $name")
}