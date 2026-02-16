package oop_00000106140_DymasiusRendragraha.week03

class Employee (val name: String) {
    var salary: Int = 0
     set(value) {
         println("Mecoba set gaji ke : $value")
         //Kode di bawah ini sangat berbahaya
         //Memanggil setter di dalam setter
//         this.salary = value; (Jadi rekursif)
         if (value < 0) {
             println("Error gaji tidak boleh negatif!")
             field = 0
         } else {
             field = value // Field untuk assign nilai asli
         }
     }
    private var performanceRating: Int = 3

    fun increasePerformance() {
        performanceRating++
        println("Kinerja $name meningkat! Rating: $performanceRating")
    }

    //Tidak membuat getter untuk performance rating, jadi data ini benar benar rahasia
    //Kecuali buat function khusus untuk print

    fun printStatus() {
        println("Karyawan: $name, Rating: $performanceRating")
    }

}