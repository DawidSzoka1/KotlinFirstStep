import java.text.SimpleDateFormat
import java.util.Date

fun main(args: Array<String>) {
    println("Podaj swoje imie:")
    val name = readLine()
    println("Podaj swoj wiek:")
    val age = readln().toDouble()

    println("Uzytkownika: $name lat $age")
    if (args.isNotEmpty()) {
        println("Enterd name: ${args[0]}")
    }else{
        println("Enter name")
    }
    println(KotlinVersion.CURRENT)
    val currentDate = Date()

    val dataFormat = SimpleDateFormat("HH:mm:ss dd:MM:yyyy")
    println(dataFormat.format(currentDate))
    println(currentDate)

}