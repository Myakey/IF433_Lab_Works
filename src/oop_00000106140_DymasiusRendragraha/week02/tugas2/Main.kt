package oop_00000106140_DymasiusRendragraha.week02.tugas2

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`);

    println("=== GAME RPG SEDERHANA ===");

    print("Masukkan Judul: ");
    val bookTitle = scanner.nextLine();

    print("Masukkan Peminjam: ");
    val borrower = scanner.nextLine();

    print("Masukkan Lama Pinjam: ");
    var loanDuration = scanner.nextInt();

    scanner.nextLine();
}