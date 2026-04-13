package oop_00000106140_DymasiusRendragraha.week08 

fun main() {
    println("=== TEST SAFE CALLS & ELVIS ===")
    val emptyOrder = Order(null, null)

    // Rantai safe calls yang elegan
    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "Kota Tidak Diketahui"
    println("Tujuan pengiriman: $destination")
}