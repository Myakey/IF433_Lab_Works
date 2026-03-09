package oop_00000106140_DymasiusRendragraha.week06

//Fungsi decoupled yang tidak peduli kelasnya apa
fun processCheckout(method: PaymentMethod, amount: Double) {
    println("-> Memulai checkout...")
    method.pay(amount) // Dynamic polymorphism
}

fun main() {
    val myWatch = Smartwatch()
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.turnOn()

    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n=== TESTING CHECKOUT ===")
    processCheckout(pay1, 50000.0)
    processCheckout(pay2, 1500000.0)

    println("\n=== TESTING RUMAH PINTAR ===")
    val lampu = SmartLamp(name = "Ruang Tamu")
    val SmartSpeaker = SmartSpeaker(name="Google Nest Dapur")
    val SmartCCTV = SmartCCTV(name="Ezviz Garasi")

    val hub = SmartHomeHub()

    hub.addDevice(lampu)
    hub.addDevice(SmartSpeaker)
    hub.addDevice(SmartCCTV)

    println("SECURITY MODE AKTIF!\n")
    hub.activateSecurityMode()
    println("\nMATIKAN SEMUA DEVICE!")
    hub.turnOfAllSwitches()
}