package oop_00000106140_DymasiusRendragraha.week02.tugas1

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`);

    println("=== APLIKASI FINE SYSTEM ===");

    print("Masukkan Judul: ");
    val bookTitle = scanner.nextLine();

    print("Masukkan Peminjam: ");
    val borrower = scanner.nextLine();

    print("Masukkan Lama Pinjam: ");
    var loanDuration = scanner.nextInt();

    scanner.nextLine();

    loanDuration = if (loanDuration < 0) 1 else loanDuration;

    val Loan = Loan(bookTitle, borrower, loanDuration);

    //Print detail peminjaman dan hasil hitung denda dengan menggunakan objek yang dibuat.
    print("Detail Peminjaman:\nJudul Buku: ${Loan.bookTitle}\nNama Peminjam: ${Loan.borrower}\nLama Pinjam: ${Loan.loanDuration}\nFine: ${Loan.calculateFine()}\n");
}