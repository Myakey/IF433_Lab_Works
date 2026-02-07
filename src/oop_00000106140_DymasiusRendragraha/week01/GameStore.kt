package oop_00000106140_DymasiusRendragraha.week01

import kotlin.math.roundToInt

fun main(){
    val gameTitle: String = "Persona 5 Reload"
    val price: Int = 300000

    val finalPrice: Int = price - calculateDiscount(price).roundToInt()

    //print recepit
    printReceipt(gameTitle, finalPrice)
}

fun calculateDiscount(price: Int) = if(price > 500000) price * 0.2 else price * 0.1

fun printReceipt(title: String, finalPrice: Int) {
    println("Title: $title, final Price: $finalPrice")
}