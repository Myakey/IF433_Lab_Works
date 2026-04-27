package oop_00000106140_DymasiusRendragraha.week09

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


    val winningTrades = closedTrades
        .filter{ it.roe > 0 }


    val losingTrades = closedTrades
        .filter{ it.roe <= 0 }


    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map { "WIN [${it.pair} - ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)" }


    val worstPerformersString = losingTrades
        .sortedBy{ it.roe }
        .map { "LOSS [${it.pair} - ${it.position}]: ${it.roe}% ROE (Lev: ${it.leverage}x)" }


    val uniquePairs = tradeHistory
        .map{ it.pair }
        .toSet()
    

    println("=== CRYPTO TRADING DASHBOARD ===")
    println("1. TOP PERFORMERS")
    topPerformersString.forEach { println(it) }

    println("2. WORST PERFORMERS")
    worstPerformersString.forEach { println(it) }

    println("3. UNIQUE PAIRS")
    println(uniquePairs)
}