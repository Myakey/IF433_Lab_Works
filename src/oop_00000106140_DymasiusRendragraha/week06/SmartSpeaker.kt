package oop_00000106140_DymasiusRendragraha.week06

class SmartSpeaker(override val id: String = "02", override val name: String = "Smart Speaker") : SmartDevice, Switchable {
    override fun turnOn() {
        println("$name menyala!")
    }

    override fun turnOff() {
        println("$name mati!")
    }

    fun playMusic(song: String) {
        println("Memutar lagu $song dari Spotify")
    }
}