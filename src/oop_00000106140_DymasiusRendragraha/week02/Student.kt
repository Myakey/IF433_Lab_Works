package oop_00000106140_DymasiusRendragraha.week02

class Student (
    val name: String,
    val nim: String,
    var major: String,
){
    init {
        //Validasi sederhana: CEK PANJANG NIM
        if (nim.length != 5) {
            println("WARNING: Objek tercipta dengan NIM ($nim) yang tidak valid!");
            println("Data mahasiswa $name mungkin akan bermasalah di sistem.");
        } else {
            println("LOG: Objek Student $name berhasil dialokasikan di Memory.");
        }
    }

    //SECONDARY CONSTRUCTOR
    //WAJIB MEMANGGIL Primary Constructor menggunakan 'this()'
    constructor(name: String, nim: String) : this(name, nim, "Non-matriculated"){
        println("LOG: Menggunakan constructor jalur umum (Tanpa jurusan).");
    }
}