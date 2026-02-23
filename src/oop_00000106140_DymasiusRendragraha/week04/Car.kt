package oop_00000106140_DymasiusRendragraha.week04

//Inheirit car is vehicle
class Car(
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
}