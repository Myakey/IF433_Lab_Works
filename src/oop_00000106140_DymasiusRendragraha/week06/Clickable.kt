package oop_00000106140_DymasiusRendragraha.week06

interface Clickable {
    //ERROR: Property in an interface cannot have a backing field
    val name: String // Abstract property, tidak ada nilai default

    //Function without body (Implicitly Abstract)
    fun click()
}