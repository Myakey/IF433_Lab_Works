package oop_00000106140_DymasiusRendragraha.week07

class Weapon private constructor(val item: GameItem, val durability: Int) {
    companion object {
        fun forgeStarterSword() : Weapon{
            println("Starter Sword Dibuat!")
            val item: GameItem = GameItem("Pedang Kayu Bapuk", 5, ItemRarity.COMMON)
            return Weapon(item, 50)
        }

        fun forgeEpicSword() : Weapon{
            println("Epic Sword Dibuat!")
            val item: GameItem = GameItem("The Sword of Eden", 1000, ItemRarity.EPIC)
            return Weapon(item, 1000)
        }
    }
}