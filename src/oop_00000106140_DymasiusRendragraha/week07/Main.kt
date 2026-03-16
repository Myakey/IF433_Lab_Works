package oop_00000106140_DymasiusRendragraha.week07

fun main() {
    println("=== TES SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TES COMPANION OBJECT ===")
    val client = NetworkClient.createClient() //Instansiasi lewat factory
    client.connect()

    println("\n=== TES REGULAR CLASS ===")
    val reg1 = RegularUser("Alice", 22)
    val reg2 = RegularUser("Alice", 22)
    println(reg1) //Cetak memori hash
    println("Sama? ${reg1 == reg2}") //FALSE

    println("\n=== TES DATA CLASS ===")
    val data1 = DataUser("Alice", 22)
    val data2 = DataUser("Alice", 22)
    println(data1) //Otomatis readable format
    println("Sama? ${data1 == data2}") // TRUE

    val data3 = data1.copy(age = 23)
    println("Hasil copy: $data3")

    val (userName, userAge) = data1 //Deklarasi destructuring
    println("Destructured: $userName berumur $userAge")

    println("\n=== TES SEALED CLASS ===")
    val response: ApiResponse = ApiResponse.Success("Data berhasil ditarik!")

    //ERROR : 'when' expression must be exhaustive
    val uiMessage = when (response) {
        is ApiResponse.Success -> "Tampilkan ${response.data}"
        is ApiResponse.Error -> "Munculkan alert: ${response.message}"
        is ApiResponse.Loading -> "Tampilkan Spinner"
    }

    println("Message: $uiMessage")


    //UJI COBA GAME!
    println("\n=== UJI COBA GAME ===")
    GameManager.startGame()
    GameManager.startGame()
}