package oop_00000106140_DymasiusRendragraha.week03

class Employee (val name: String) {
 var salary: Int = 0
     set(value) {
         println("Mecoba set gaji ke : $value")
         //Kode di bawah ini sangat berbahaya
         //Memanggil setter di dalam setter
         this.salary = value;
     }
}