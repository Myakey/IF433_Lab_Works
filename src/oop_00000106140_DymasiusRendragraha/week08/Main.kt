package oop_00000106140_DymasiusRendragraha.week08 

fun main() {
    println("=== TEST SAFE CALLS & ELVIS ===")
    val emptyOrder = Order(null, null)

    // Rantai safe calls yang elegan
    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "Kota Tidak Diketahui"
    println("Tujuan pengiriman: $destination")

    println("\n=== TEST LET BLOCK ===")
    val validOrder = Order(null, 250000)

    val receipt = validOrder.totalPrice?.let {price ->
        //Block ini hanya jalan jika totalPrice tidak null
        val tax = price * 0.11
        "Transaksi Valid. Harga: Rp$price, Pajak: Rp$tax"
    } ?: "Transaksi Invalid: Harga belum di-set!"

    println(receipt)
}