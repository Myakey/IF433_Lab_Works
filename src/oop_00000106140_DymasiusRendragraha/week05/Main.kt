package oop_00000106140_DymasiusRendragraha.week05

fun main() {
    val dosen1 = Dosen(nama="Pak Alex", nidn="0123456")
    val admin1 = Admin(nama="Bu Siti")

    //Koleksi polymorphic : List yg berisi tipe Parent, tapi isinya objek Anak
    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        //Pemanggilan polymorphism
        pegawai.bekerja()

        //pegawai.mengajar() //INI AKAN ERROR karena tipe referensinya adalah Pegawai

        when(pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("------------------------------------")
    }

    println("=== Math Test ===")
    val mathHelp1 = MathHelper()

    println("Math hitung luas dengan sisi 3 ${mathHelp1.hitungLuas(sisi = 3)}")
    println("Math hitung luas dengan panjang 3 lebar 2 ${mathHelp1.hitungLuas(panjang = 3, lebar = 2)}")
    println("Math hitung luas dengan jari - jari 3 ${mathHelp1.hitungLuas(jariJari = 3.0)}")
}