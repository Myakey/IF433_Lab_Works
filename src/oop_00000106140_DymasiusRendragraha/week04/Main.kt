package oop_00000106140_DymasiusRendragraha.week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle("Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("--- Testing Car ---")
    val myCar = Car("Toyota", 4)
    myCar.openTrunk() //Memanggil method milik sendiri
    myCar.honk() //Memanggil method yang sudah di-overide
    myCar.accelerate() //Memanggil gabungan method Parent dan Child
}