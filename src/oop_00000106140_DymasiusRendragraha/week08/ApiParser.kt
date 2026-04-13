package oop_00000106140_DymasiusRendragraha.week08

class ApiParser {

    fun parseProduct(rawJson: Map<String, Any?>): Product? {

        val id = requireNotNull(rawJson["id"] as? String) {
            "Invalid: Tidak ada ID!"
        }

        val name = requireNotNull(rawJson["name"] as? String) {
            "Invalid: Tidak ada nama!"
        }

        val type = rawJson["type"] as? String

        return when (type) {

            "ELECTRONIC" -> {
                val warrantyMonths = rawJson["warrantyMonths"] as? Int ?: 12

                Product.Electronic(
                    id = id,
                    name = name,
                    warrantyMonths = warrantyMonths
                )
            }

            "CLOTHING" -> {
                val size = rawJson["size"] as? String ?: "All Size"

                Product.Clothing(
                    id = id,
                    name = name,
                    size = size
                )
            }

            else -> null
        }
    }
}