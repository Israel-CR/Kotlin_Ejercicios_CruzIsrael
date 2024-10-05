package Bucles

fun main() {
//    29.Múltiplos de 5 entre 1 y n: Muestra todos los múltiplos de 5 entre 1 y
//    un número dado n.

    var numero: Int;
    while (true) {
        try {
            print("Escribe un numero: ")
            numero = readln().toInt()
            for (i in 1..numero) {
                if (i % 5 == 0) {
                    println(i)
                }
            }
            break
        } catch (e: NumberFormatException) {
            println("Error: numero invalido, intente de nuevo")
        }
    }
}