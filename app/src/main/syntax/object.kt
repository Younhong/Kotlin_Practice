package com.example.practice

fun main() {
    val car = CarFactory.makeCar(10)
    var car2 = CarFactory.makeCar(200)

    println(car)
    println(car2)
    println(CarFactory.cars.size.toString())

}

// singleton pattern : 앱을 실행하면서 딱 한 번 객체를 생성 : 불필요한 메모리 사용 줄임
object CarFactory {
    val cars = mutableListOf<Car>()

    fun makeCar(horsePower: Int) : Car {
        val car = Car(horsePower)
        cars.add(car)
        return car
    }
}

data class Car(val horsePower : Int)
