package oop_00000106140_DymasiusRendragraha.week03.tugas

class Player (
    var username: String
) {
    private var xp: Int = 0

    val level: Int
        get() = (xp / 100) + 1

    fun addXp(amount: Int) {
        if (amount < 0) {
            println("Error: tidak boleh negatif!")
            return
        }
        val oldLevel = level
        xp += amount
        val newLevel = level

        if (newLevel > oldLevel) {
            println("Level Up! $username is now level $newLevel 🎉")
        }
    }
}