package oop_00000106140_DymasiusRendragraha.week01

fun main() {

    val radius: Double = 7.0
    val pi: Double = 3.14

    var area = pi * radius * radius

    println("Radius: $radius, Area: $area")

    println("${checkSize(area)}")
}

fun checkSize(area: Double) = if (area > 100) "This is a Big Circle" else "This is a Small Circle"