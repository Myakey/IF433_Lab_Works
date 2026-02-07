package oop_00000106140_DymasiusRendragraha.week01

fun main(){
    val gameTitle: String = "Persona 5 Reload"
    val price: Int = 300000
}

fun calculateDiscount(price: Int) = if(price > 500000) price * 0.2 else price * price * 0.1