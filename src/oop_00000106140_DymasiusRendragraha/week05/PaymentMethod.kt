package oop_00000106140_DymasiusRendragraha.week05

abstract class PaymentMethod (val accountName: String) {
    abstract fun processPayment(amount: Double)
}