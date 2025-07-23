package openClass


fun main() {
    val merceds = Car("Merceds", "White", 43, 5)
    val boing = Plane("Boy", "Cyan", 50, 5, "Da")
    println("Merceds: $merceds")
    merceds.stop()
    boing.stop()
    println("Boy: $boing")
}