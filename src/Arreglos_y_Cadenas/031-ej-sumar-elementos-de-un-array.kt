package Arreglos_y_Cadenas

fun main() {
//    31.Sumar elementos de un array: Crea un array de 5 números enteros y
//    muestra la suma de sus elementos.

        val numeros = intArrayOf(1, 6, 3, 4, 10)
        var suma = 0

        for (i in numeros) {
            suma += i
        }
        println("La suma de los elementos del array es: $suma")
}