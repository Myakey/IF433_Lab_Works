package oop_00000106140_DymasiusRendragraha.week03.tugas

class Weapon (
    val name: String,
    var damage: Int
){
    val tier: String
        get() = if (damage > 800) "Legendary" else if (damage > 500) "Epic" else "Common"
}