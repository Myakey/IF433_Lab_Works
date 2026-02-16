package oop_00000106140_DymasiusRendragraha.week03.tugas

class Weapon (
    val name: String,
){
    var damage: Int = 0
        set(value){
            if (value > 0) {
                println("Weapon $name set damage jadi $value")
                field = value
            } else {
                println("Damage tidak boleh negatif!")
                field = 0
            }
        }
    val tier: String
        get() = if (damage > 800) "Legendary" else if (damage > 500) "Epic" else "Common"
}