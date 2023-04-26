package com.example.kotlinbasics

fun main(){
    val ferrari = RedCar(300.0, "ferrari")

    var drive = ferrari.drive()
    println(drive)

    var brake = ferrari.brake()
}

interface Drivable{
    val maxSpeed : Double
    fun drive() : String
    fun brake(){
        println("The drivable is braking")
    }
}

open class MyCar(override  val maxSpeed:Double) : Drivable{

    override fun drive(): String {
        return "Drive my car"
    }


}

class RedCar(maxSpeed: Double,name:String,):MyCar(maxSpeed){

    override fun drive(): String {
        return "Drove for $maxSpeed KM"
    }
    override fun brake() {
        super.brake()
    }
}