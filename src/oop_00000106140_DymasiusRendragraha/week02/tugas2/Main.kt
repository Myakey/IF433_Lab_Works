package oop_00000106140_DymasiusRendragraha.week02.tugas2

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`);

    println("=== GAME RPG SEDERHANA ===");

    print("Masukkan Nama Hero: ");
    val heroName = scanner.nextLine();

    print("Masukkan Stat Damage: ");
    val statDamage = scanner.nextInt();

    scanner.nextLine();

    val Hero = Hero(heroName, statDamage);

    var enemyHP = 100;

    while(Hero.isAlive() && enemyHP > 0){
        print("Musuh terlihat!:\n1. Serang\n2. Kabur\n");
        print("Pilihan: ");
        val pilihan = scanner.nextInt();
        scanner.nextLine();

        when (pilihan) {
            1 -> {
                Hero.attack("Musuh");
                enemyHP -= Hero.baseDamage;
                println("Sisa HP Musuh: $enemyHP");

                if (enemyHP > 0) {
                    Hero.takeDamage((10..20).random());
                    println("Sisa HP Hero: ${Hero.hp}");
                } else {
                    break;
                }
            }
            2 -> {
                println("Kabur!");
                break;
            }
            else -> print("Salah opsi!")
        }
    }

    if (enemyHP > 0) {
        println("Musuh menang!");
    } else {
        println("Kamu menang!");
    }
}