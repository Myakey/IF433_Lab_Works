package oop_00000106140_DymasiusRendragraha.week08 

class NotificationService {
    fun sendEmail(emailAddress: String) {
        println("Mengirim e-mail ke: $emailAddress")
    }

    fun processUser(user: UserProfile) {
        //sendEmail(user.email) INI AKAN ERROR TYPE MISMATCH
        
        if (user.email != null) {
            //SUCCESS via smart cast, beritahu user.email pasti tidak null di block ini
            sendEmail(user.email)
        } else {
            println("User ${user.name} tidak memiliki email.")
        }
    }
}