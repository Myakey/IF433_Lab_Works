package oop_00000106140_DymasiusRendragraha.week02

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`);

    println("--- APLIKASI PMB UMN ---");

    print("Masukkan nama: ");
    val name = scanner.nextLine();

    print("Masukkan NIM (Wajib 5 Karakter): ");
    val nim = scanner.next();

    scanner.nextLine(); //Membersihkan buffer newline

    //Validasi sisi pemanggil (Main)
    if (nim.length != 5) {
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!");
        // Program berhenti di sini untuk mahasiswa ini, tidak membuat objek
    } else {
        print("Masukkan jurusan: ");
        val major = scanner.nextLine();

        // Inisialisasi objek karena data sudah aman
        val s1 = Student(name, nim, major);
        println("Status pendaftaran: Selesai");
    }
}