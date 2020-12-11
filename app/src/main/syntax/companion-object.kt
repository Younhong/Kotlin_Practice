package com.example.practice

class Book private constructor(val id : Int, val name : String) {
    companion object BookFactory : IdProvider {
        override fun getId(): Int {
            return 404
        }
        val myBook = "Animal Farm"

        fun create() = Book(getId(), myBook)
    }
}

interface IdProvider {
    fun getId() : Int
}

fun main() {
    val book = Book.create()
    val bookId = Book.BookFactory.getId()

    println("${book.id} ${book.name}")
    println(bookId)
}
