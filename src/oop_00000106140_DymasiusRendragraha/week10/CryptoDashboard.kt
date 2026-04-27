package oop_00000106140_DymasiusRendragraha.week10

import oop_00000106140_DymasiusRendragraha.week07.ApiResponse

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 2.5453))
    coinRepo.add(Coin("ETH", 1.25))
    coinRepo.add(Coin("USDT", 500.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("===API RESPONSE FOR WALLET===")
    println("Status: ${response.status}")

    response.data.forEach{ c ->
        println("Coin: ${c.name}")
        println("Balance: ${c.balance}")
        print("\n\n")
    }

    val txRepo = WalletRepository<Transaction>()

    txRepo.add(Transaction("BTC-0001", 2.5453))
    txRepo.add(Transaction("ETH-0002", 1.25))
    txRepo.add(Transaction("USDT-0003", 500.0))

    println("===Transaction History===")
    txRepo.getAll().forEach{ history ->
        println("Transaction: ${history.name}")
        println("Amount: ${history.amount}")
        print("\n\n")
    }
}