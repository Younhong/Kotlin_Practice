package com.example.practice

fun main() {
    array()
    forAndWhile()
}

fun array() {
    val array = arrayOf(1,2,3)
    val list = listOf(1,2,3)

    val array2 = arrayOf(1, "d", 3.4f)
    val list2 = listOf(1, "y", 11L)

    // array : mutable
    array[0] = 2
    // list : list or mutable list
    // list[0] = 2 --> 실행 안 됨

    val arrayList = arrayListOf<Int>()
    arrayList.add(10)
    println("mutable array list: $arrayList")
    arrayList.add(20)
    println("mutable array list: $arrayList")
}

fun forAndWhile() {
    val students = arrayListOf("joyce", "younhong", "jennifer")

    for (name in students) {
        println(name)
    }

    var sum : Int = 0
    for (i in 1..10) {
        sum += i
    }
    println(sum)

    sum = 0
    for (i in 1..10 step 2) {
        sum += i
    }
    println(sum)

    sum = 0
    for (i in 10 downTo 1) {
        sum += i
    }
    println(sum)

    sum = 0
    for (i in 1 until 10) {
        sum += i
    }
    println(sum)

    var index = 0
    while(index < 10) {
        println("Current index : $index")
        index++
    }

    for ((index, name) in students.withIndex()){
        println("${index+1}번째 학생: $name")
    }
}
