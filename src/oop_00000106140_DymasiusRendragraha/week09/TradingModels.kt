package oop_00000106140_DymasiusRendragraha.week09

data class TradeLog(
    val pair: String,
    val position: String,
    val leverage: Int,
    val roe: Double,
    val status: String
)

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 50, 120.0, "CLOSED"),
        TradeLog("SOLUSDT", "LONG", 10, -10.0, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 20, 5.0, "OPEN"),
        TradeLog("BNBUSDT", "SHORT", 5, -2.5, "CLOSED")
    )

    val closedTrades = tradeHistory
        .filter{ it.status == "CLOSED" }

    println(closedTrades)

    val winningTrades = closedTrades
        .filter{ it.roe > 0 }

    println(winningTrades)

    val losingTrades = closedTrades
        .filter{ it.roe <= 0 }

    println(losingTrades)

    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map { "WIN [${it.pair} - ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)" }

    println(topPerformersString)

    val worstPerformersString = losingTrades
        .sortedBy{ it.roe }
        .map { "LOSS [${it.pair} - ${it.position}]: ${it.roe}% ROE (Lev: ${it.leverage}x)" }

    println(worstPerformersString)

    val uniquePairs = tradeHistory
        .map{ it.pair }
        .toSet()

    println(uniquePairs)
}