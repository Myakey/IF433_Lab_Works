package oop_00000106140_DymasiusRendragraha.week05

class EWallet(accountName: String,  var balance: Double) : PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
           println("Pembayaran dengan E Wallet Cukup dan sukses!")
        } else {
            println("Pembayaran dengan  E Wallet Tidak cukup!")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
    }
}