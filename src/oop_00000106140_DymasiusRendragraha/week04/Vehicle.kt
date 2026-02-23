package oop_00000106140_DymasiusRendragraha.week04

class Vehicle(
    val brand: String
) {
    var speed: Int = 0

    // Method bersifat final secara default. Gunakan 'open' agar bisa dioverride
    open fun accelerate() {
        speed += 10
        println("$brand melaju. Kecepatan: $speed km/jam")
    }

    open fun honk() {
        println("Beep beep!")
    }
}