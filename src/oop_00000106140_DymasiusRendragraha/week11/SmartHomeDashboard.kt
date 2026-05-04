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
}