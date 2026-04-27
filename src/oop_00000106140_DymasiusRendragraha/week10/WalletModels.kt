package oop_00000106140_DymasiusRendragraha.week10

data class Coin(
    override val name: String,
    val balance: Double
): HasName

data class Transaction(
    val id: String,
    val amount: Double
)

interface HasName {
    val name: String
}