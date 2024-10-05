package Arreglos_y_Cadenas

fun main() {
//    32.Encontrar el número más grande en un array: Dado un array de
//    números, encuentra el mayor.

    val numeros = intArrayOf(1, 6, 3, 4, 10,12)
    var mayor = numeros[0]

    for (i in numeros) {
        if (i > mayor) {
            mayor = i
        }
    }
    println("El número más grande en el array es: $mayor")
}