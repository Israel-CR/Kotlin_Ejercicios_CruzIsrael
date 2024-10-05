package Bucles

fun main() {
//    24.Números pares hasta n: Pide un número n y muestra todos los
//    números pares entre 1 y n.

    var numero: Int;

    while (true) {
        try {
            print("Escribe un numero: ")
            numero = readln().toInt()
            for (i in 1..numero) {
                if (i % 2 == 0) {
                    println(i)
                }
            }
            break
        } catch (e: NumberFormatException) {
            println("Error: numero invalido, intente de nuevo")
        }
    }
}