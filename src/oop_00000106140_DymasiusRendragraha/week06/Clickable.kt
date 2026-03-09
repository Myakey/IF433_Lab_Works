package oop_00000106140_DymasiusRendragraha.week06

interface Clickable {
    //ERROR: Property in an interface cannot have a backing field
    val name: String = "Tombol Rahasia"

    //Function without body (Implicitly Abstract)
    fun click()
}