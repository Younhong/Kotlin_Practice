package com.example.practice

open class Human (val name : String = "Anonymous") {
    // constructor 부분은 추가 가능 --> class Human constructor (~~)

    constructor(name : String, age : Int) : this(name) {
        println("My name is ${name}, $age years old")
    }

    // val name : String = name

    init {
        println("New human has been born")
    }

    fun eatingCake() {
        println("This cake is so yummy~~")
    }

    open fun singSong() {
        println("Sing")
    }
}

class Korean() : Human(name = "익명"){
    override fun singSong() {
        super.singSong()
        println("싱싱싱")
        println("My name is $name")
    }
}

fun main() {
    var human = Human("younhong")
    var stranger = Human()

    human.eatingCake()

    val me = Human("Younhong", 27)

    println("This human's name is ${human.name}")

    println("This human's name is ${stranger.name}")

    val korean = Korean()
    korean.singSong()
}
