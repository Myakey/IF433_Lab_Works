package oop_00000106140_DymasiusRendragraha.week07

object DatabaseManager {
    var connectionStatus: String  = "Disconnected"

    fun connect() {
        connectionStatus = "Connected to Server"
        println("Database is ready.")
    }
}