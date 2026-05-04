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

    val ac1 = run {
        val dev = SmartDevice("Daikin Inverter (Kabel 3x2.5)", "HVAC", false, 800)
        dev
    }
    homeDevices.add(ac1)

    homeDevices.add(SmartDevice("Picolo's Auto Feeder", "Pet Care", true, 10))
}