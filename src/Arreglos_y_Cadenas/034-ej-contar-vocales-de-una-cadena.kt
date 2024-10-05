package Arreglos_y_Cadenas

fun main() {
//    34.Contar vocales en una cadena: Dada una cadena, cuenta cuántas
//    vocales contiene.

    print("Escribe una cadena: ")
    val cadena = readln().toString()
    var contador = 0

    for (i in cadena) {
        if (i in "aeiouAEIOU") {
            contador++
        }
    }
    println("La cadena tiene $contador vocales")
}