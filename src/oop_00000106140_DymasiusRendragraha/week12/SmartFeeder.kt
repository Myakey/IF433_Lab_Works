package oop_00000106140_DymasiusRendragraha.week12

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {
    require(requestedGram > 0) { "Porsi kibble harus lebih dari 0 gr" }

    if (isJammed) throw DispenserJamException()

    if (requestedGram > availableGram) throw FoodEmptyException(requestedGram, availableGram)
    //Println
    println("Kibble berhasil dikeluarkan!")
    return availableGram - requestedGram
}

fun main() {
    var currentKibbleStock = 50

    // JADWAL MAKAN 1
    println("=== JADWAL MAKAN PAGI ===")
    try {
        currentKibbleStock = dispenseKibble(80, currentKibbleStock, false)
    }
    catch (e: DispenserJamException) {
        println("Error: ${e.message}")
    } catch (e: FoodEmptyException) {
        println("Error: ${e.message}")
    } catch (e: Exception) {
        println("General Error: ${e.message}")
    }

    finally {
        println("Siklus pengecekan dispenser pagi selesai.")
    }

    print("\n")

    // JADWAL MAKAN 2
    println("=== JADWAL MAKAN SORE ===")

    currentKibbleStock = 1000

    val result = runCatching {
        dispenseKibble(30, currentKibbleStock, false)
    }

    result
        .onSuccess { newStock ->
            currentKibbleStock = newStock
            println("Makan sore sukses! Sisa stok kibble: $currentKibbleStock gr")
        }
        .onFailure { error ->
            println("Peringatan ke Pemilik: ${error.message}")
            println("(Opsional: Berikan chicken jerky secara manual)")
        }
}