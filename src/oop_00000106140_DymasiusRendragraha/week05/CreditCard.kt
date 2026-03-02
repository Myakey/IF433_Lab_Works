package oop_00000106140_DymasiusRendragraha.week05

class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {

    }
}