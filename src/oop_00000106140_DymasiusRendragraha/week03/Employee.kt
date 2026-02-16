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
}