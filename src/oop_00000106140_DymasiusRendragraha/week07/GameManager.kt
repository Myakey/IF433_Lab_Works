package oop_00000106140_DymasiusRendragraha.week07

object GameManager {
    var isGameRunning: Boolean = false

    fun startGame() {
        if (!isGameRunning) {
            isGameRunning = true
            println("Memulai game engine...")
        } else {
            println("Game sudah berjalan! Mencegah inisiasi ganda!")
        }
    }
}