package oop_00000106140_DymasiusRendragraha.week06

class SmartLamp(override val id: String = "01", override val name: String = "Smart Lamp") : SmartDevice, Switchable {
    override fun turnOn(){ println("$name menyala!") }
    override fun turnOff(){ println("$name mati!") }
}