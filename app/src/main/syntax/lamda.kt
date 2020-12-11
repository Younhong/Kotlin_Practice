package com.example.practice

fun main() {
    println(square(3))
    println(nameAge("younhong", 27))
    val a = "younhong said"
    val b = "mac said"
    println(a.pizzaIsGreat())
    println(b.pizzaIsGreat())

    println(extendString("joy", 23))

    println(calculateGrade(77))

    val lamda = {number : Double ->
        number == 4.3213
    }

    println(invokeLamda(lamda))

    // println(invokeLamda({it > 3.11}))
    // 파라미터가 한 개일때 () 괄호 생략 가능
    println(invokeLamda{it > 3.11})
}

/*
    lamda : value처럼 다룰 수 있는 익명 함수
    1) 메소드의 파라미터로 넘길 수 있다.
    2) 함수를 리턴할 수 있다.

    람다의 정의
    val lamdaName : Type = {argumentList -> code-body}
*/

val square : (Int) -> Int = {number -> number * number}

val nameAge = {name : String, age : Int ->
    "My name is $name I'm $age"
}

// 확장함수
val pizzaIsGreat : String.() -> String = {
    this + " Pizza is the best!!"
}

fun extendString(name : String, age : Int) : String {
    val introduceMyself : String.(Int) -> String = {"I am $this and $it years old"}
    return name.introduceMyself(age)
}

val calculateGrade : (Int) -> String = {
    when(it) {
        in 0..40 -> "fail"
        in 41..70 -> "pass"
        in 71..100 -> "perfect"
        else -> "error"
    }
}

fun invokeLamda(lamda : (Double) -> Boolean) : Boolean {
    return lamda(5.2343)
}

/*
    람다식 이용 조건
    1. kotlin이 아닌 java 인터페이스여야 한다.
    2. 단 하나의 메소드만 가져야 한다.
 */
