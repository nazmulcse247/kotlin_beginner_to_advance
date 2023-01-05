import java.text.SimpleDateFormat
import java.util.Calendar

fun main(){

    printCurrentDateTime()
    println(returnDateTime())
}

//void function
fun printCurrentDateTime() {

    val calendar = Calendar.getInstance().time
    val sdf = SimpleDateFormat("dd/MM/yyyy hh:mm:ss")
    val currentDate = sdf.format(calendar)
    println("Current Date Is : $currentDate")
}

// return type function
fun returnDateTime() : String {
    val calendar = Calendar.getInstance().time
    val sdf = SimpleDateFormat("dd-MM-yyyy hh:mm:ss")
    val currentDate = sdf.format(calendar)

    return currentDate
}