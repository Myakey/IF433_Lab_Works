package oop_00000106140_DymasiusRendragraha.week03

fun main(){
    val e = Employee("Budi")

    e.salary = -1000 //test negatif
    e.salary = 50000000
    println("Gaji: ${e.salary}")

    //2. Tes encapsulation
    e.increasePerformance()

    //3. Tes  Computed property
    println("Pajak yang harus dibayar: ${e.tax}")
}