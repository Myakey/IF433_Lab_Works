package oop_00000106140_DymasiusRendragraha.week06

class SmartCCTV(override val id: String = "03", override val name: String = "Smart CCTV") : SmartDevice, Switchable, Recordable {
    override fun turnOn() {
        println("$name menyala!")
        startRecord()
    }

    override fun turnOff() {
        println("$name mati!")
        stopRecord()
    }

    override fun startRecord() {
        println("$name Merekam!")
    }

    override fun stopRecord() {
        println("$name Berhenti merekam!")
    }
}