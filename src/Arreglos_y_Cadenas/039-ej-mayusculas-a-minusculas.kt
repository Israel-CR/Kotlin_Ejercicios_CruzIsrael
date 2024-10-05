package Arreglos_y_Cadenas

fun main() {
//    39.Mayúsculas a minúsculas: Convierte una cadena dada a
//    minúsculas.

    print("Escribe una cadena: ")
    val cadena = readln().toString()
    var cadenaMinusculas = ""

    for (i in cadena) {
        if (i in 'A'..'Z') {
            cadenaMinusculas += (i + 32).toChar()
        } else {
            cadenaMinusculas += i
        }
    }
    println("La cadena en minúsculas es: $cadenaMinusculas")
}