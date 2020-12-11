package com.example.practice

fun main() {
    println(maxBy(3,5))
    println(maxBy2(9,7))
    checkNum(5)
}

fun maxBy(a : Int, b : Int) : Int {
    return if (a > b) a
    else b
}

fun maxBy2(a : Int, b : Int) : Int = if (a > b) a else b

// 삼항연산(a > b ? a : b) 안됨

fun checkNum(score : Int) {
    when (score) {
        0 -> println("This is 0")
        1 -> println("This is 1")
        2,3 -> println("This is 2 or 3")
        else -> println("I don't know")
    }

    var b : Int = when(score) {
        1 -> 1
        2 -> 2
        else -> 3
    }
    println("b: $b")

    when(score) {
        in 90..100 -> println("You are genius")
        in 10..80 -> println("not bad")
        else -> println("ok")
    }
}
