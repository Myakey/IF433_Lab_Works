package oop_00000106140_DymasiusRendragraha.week03.tugas

fun main() {
    val weapon = Weapon("Pedang");
    weapon.damage = -50

    weapon.damage = 9999

    println("Tier weapon: ${weapon.tier}")

    val player = Player("Nora")

    player.addXp(50)
    player.addXp(60)

}