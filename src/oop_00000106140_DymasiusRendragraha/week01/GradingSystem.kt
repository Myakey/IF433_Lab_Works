package oop_00000106140_DymasiusRendragraha.week01

fun main(){
    //REFACTOR: Gunakan val karena variabel tidak berubah
    val name: String = "John Thor"
    val score: Int = 80

    //String template
    println("Nama: $name, Nilai: $score")

    val grade = when(score){
        in 90..100 -> "A"
        in 80..100 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }

    println("Grade kamu: $grade")

    println("Status: ${calculateStatus(score)}")
}

fun calculateStatus(score: Int) = if (score > 75) "Lulus" else "Tidak Lulus"

