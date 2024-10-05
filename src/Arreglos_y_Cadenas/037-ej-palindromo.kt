package Arreglos_y_Cadenas

fun main() {
//    37.Palíndromo: Escribe un programa que determine si una palabra es un
//    palíndromo.

    print("Escribe una palabra: ")
    val palabra = readln().toString()
    var esPalindromo = true

    for (i in 0..< palabra.length / 2) {
        if (palabra[i] != palabra[palabra.length - 1 - i]) {
            esPalindromo = false
            break
        }
    }
    if (esPalindromo) {
        println("La palabra $palabra es un palíndromo")
    } else {
        println("La palabra $palabra no es un palíndromo")
    }
}