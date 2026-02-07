package oop_00000106140_DymasiusRendragraha.week01

import kotlin.math.roundToInt

fun main(){
    val gameTitle: String = "Persona 5 Reload"
    val price: Int = 300000
    val userNote: String? = null

    val finalPrice: Int = price - calculateDiscount(price).roundToInt()

    printReceipt(gameTitle, finalPrice, userNote)
}

fun calculateDiscount(price: Int) = if(price > 500000) price * 0.2 else price * 0.1

fun printReceipt(title: String, finalPrice: Int, userNote: String?) {
    val notes = userNote ?: "Tidak ada catatan"
    println("Title: $title, final Price: $finalPrice, user note: $notes")
}