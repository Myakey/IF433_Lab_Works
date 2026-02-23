package oop_00000106140_DymasiusRendragraha.week04

//Inheirit car is vehicle
open class Car(
    brand: String,
    val numberOfDoors: Int
) : Vehicle(brand)
{
    fun openTrunk() {
        println("Bagasi mobil $brand dengan $numberOfDoors pintu dibuka.")
    }

    override fun honk() {
        println("TIN TIN! Mobil $brand lewat!")
    }

    override fun accelerate() {
        super.accelerate() //Memanggil logika penambahan kecepatan milik parent
        println("Mobil $brand menggunakan transimisi gigi untuk menambah kecepatan.")
    }
}