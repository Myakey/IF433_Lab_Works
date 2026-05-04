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

    val searchResult = homeDevices.find { it.category == "Camera" }
    searchResult?.let {
        println(it.diagnose())
    }

    with(homeDevices) {
        println("Total devices registered: ${this.size}")
    }

    val totalPower = homeDevices.run {
        sumOf { it.powerLoad }
    }
    println("Total power usage: $totalPower Watt")

    homeDevices.forEach {
        println(it.diagnose())
    }
}