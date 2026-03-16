package oop_00000106140_DymasiusRendragraha.week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> {
            println("Monster ${event.monsterName} muncul!")
        }
        is BattleState.LootDropped -> {
            val (itemName, rarity) = event.item
            println("Mendapat loot: $itemName (${rarity})")
        }
        is BattleState.GameOver -> {
            println("Game Over! Kamu kalah dalam battle.")
        }
        BattleState.SafeZone -> {
            println("Anda berada di Safe Zone. Aman!")
        }
    }
}