package oop_00000106140_DymasiusRendragraha.week05

class Dosen(nama: String, val nidn: String) : Pegawai(nama) {
    //WAJIB DI-OVERIDE karna fungsi bekerja() bersifat abstract di parent
    override fun bekerja() {
        println("[$nama] sedang menyiapkan materi perkuliahan dan merevisi RPKPS. ")
    }

    //Fungsi unik yang hanya dimiliki oleh dosen
    fun mengajar() {
        println("[$nama] sedang mengajar mahasiswa di kelas.")
    }
}