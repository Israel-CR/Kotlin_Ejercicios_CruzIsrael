package Arreglos_y_Cadenas

fun main() {
//    38.Números repetidos en un array: Dado un array, encuentra y muestra
//    los números repetidos.

    val numeros = intArrayOf(1, 6, 3, 4, 10, 12, 6, 3, 4, 10)
    val numerosRepetidos = mutableListOf<Int>()

    for (i in numeros) {
        if (numeros.count { it == i } > 1 && !numerosRepetidos.contains(i)) {
            numerosRepetidos.add(i)
        }
    }
    println("Los números repetidos en el array son: $numerosRepetidos")
}