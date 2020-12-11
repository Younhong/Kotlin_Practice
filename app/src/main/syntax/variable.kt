package com.example.practice

fun main() {
    helloWorld()
    println(add(3, 5))

    val name = "Younhong"
    val lastName = "Ko"
    println("My name is ${name + lastName}")
    println("This is 2\$")
    
    hi()
}

fun helloWorld(): Unit {
    println("hello world")
}

fun add(a : Int, b : Int) : Int {
    return a+b
}

fun hi() {
    val a : Int = 10
    var b : Int = 10
    val name = "Younhong"
    b = 100
//    a = 10 --> 실행 안 됨
}
