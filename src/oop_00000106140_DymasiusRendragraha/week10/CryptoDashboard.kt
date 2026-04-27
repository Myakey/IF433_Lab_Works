package oop_00000106140_DymasiusRendragraha.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 2.5453))
    coinRepo.add(Coin("ETH", 1.25))
    coinRepo.add(Coin("USDT", 500.0))


}