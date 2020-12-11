package com.example.practice

fun main() {
    nullCheck()
    ignoreNulls("Not Null")
}

fun nullCheck() {
    var name : String = "Younhong"
    var nullName : String? = null

    var nameInUpperCase = name.toUpperCase()
    var nullNameInUpperCase = nullName?.toUpperCase()

    println(nameInUpperCase)
    println(nullNameInUpperCase)

    var lastName : String? = null
    var fullName : String = name + " " + (lastName ?: "No lastname")
    println(fullName)

    var lastName2 : String? = "Ko"
    var fullName2 : String = name + " " + (lastName2 ?: "No lastname")
    println(fullName2)
}

fun ignoreNulls(str : String?) {
    val notNull : String = str!!
    val upper : String = notNull.toUpperCase()
    println(upper)

    var email : String ?= "younhong@kakao.com"
    email?.let {
        // let은 null이 아닐 때만 실행됨
        println("My email is $it")
    }
    email = null
    email?.let {
        println("My email is $email")
    }
}
