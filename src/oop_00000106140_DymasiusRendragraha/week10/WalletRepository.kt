package oop_00000106140_DymasiusRendragraha.week10

class WalletRepository<T: HasName>() {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }

    fun findByName(query: String): T? {
        return items.find { it.name == query }
    }
}