package oop_00000106140_DymasiusRendragraha.week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle("Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()
    println("\n")

    println("--- Testing Car ---")
    val myCar = Car("Toyota", 4)
    myCar.openTrunk() //Memanggil method milik sendiri
    myCar.honk() //Memanggil method yang sudah di-overide
    myCar.accelerate() //Memanggil gabungan method Parent dan Child
    println("\n")

    println("--- Testing Electric Car ---")
    val myElectricCar = ElectricCar("Hyundai", 4, 100)
    myElectricCar.accelerate()
    myElectricCar.openTrunk()
    myElectricCar.honk()
    println("\n")

    println("--- Testing Employee Hierarchy ---")
    val mgr = Manager("Peter Griffin", 10000000)
    val developer = Developer("Joe Swanson", 5000000, "Golang")
    println("${mgr.name} sebagai manager mendapatkan bonus ${mgr.calculateBonus()}") // print bonus dari manager
    println("${developer.name} sebagai developer mendapatkan bonus ${developer.calculateBonus()}")

}