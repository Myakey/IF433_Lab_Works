package oop_00000106140_DymasiusRendragraha.week11

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()

    val lampu1 = SmartDevice(
        name = "Philips WiZ Living Room",
        category = "Lighting").apply{
            isOnline = true
            powerLoad = 12
        }.also {
            homeDevices.add(it)
    }

    val camera1 = SmartDevice( "Evziz Outdoor", "Camera" ).apply{
        isOnline = true
        powerLoad = 5
    }.also{
        println("(LOG) Kamera Terhubu")
        homeDevices.add(it)
    }
}