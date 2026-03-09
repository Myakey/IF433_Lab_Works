package oop_00000106140_DymasiusRendragraha.week06

// ERROR: Class Smartphone inherits multiple implementationws of turnOn()
class Smartphone : Camera, Phone {
    //Manually override to resolve ambiguity
    override fun turnOn() {
        super<Camera>.turnOn() // Menjalankan logika camera
        super<Phone>.turnOn() // Menjalankan logika Phone
        println("Sistem operasi Smartphone berhasil booting.")
    }
}