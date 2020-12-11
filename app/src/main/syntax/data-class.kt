package com.example.practice

fun main() {
    val ticket = Ticket("koreanAir", "younhong", "2020-07-16", 14)
    val ticket2 = TicketNormal("koreanAir", "younhong", "2020-07-16", 14)

    println(ticket)
    println(ticket2)
    println(ticket.equals(ticket2))
}

data class Ticket(
    val companyName : String, val name : String, var date : String, var seatNumber : Int)

class TicketNormal(val companyName : String, val name : String, var date : String, var seatNumber : Int)
