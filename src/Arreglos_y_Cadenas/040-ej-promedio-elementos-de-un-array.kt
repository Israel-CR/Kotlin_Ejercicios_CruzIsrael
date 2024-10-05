package Arreglos_y_Cadenas

fun main() {
//    40.Promedio de elementos de un array: Crea un array de números
//            enteros y muestra el promedio de sus elementos.

        val numeros = intArrayOf(10, 6, 8, 9, 10)
        var suma:Double=0.0;

        for (i in numeros) {
            suma += i
        }

        val promedio:Double = suma / numeros.size
        println("El promedio de los elementos del array es: $promedio")
}