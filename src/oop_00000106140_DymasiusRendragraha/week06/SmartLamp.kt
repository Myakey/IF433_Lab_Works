package oop_00000106140_DymasiusRendragraha.week06

class SmartLamp(override val id: String = "01", override val name: String = "Smart Lamp") : SmartDevice, Switchable {
    override fun turnOn(){ println("Lampu menyala!") }
    override fun turnOff(){ println("Lampu mati!") }
}