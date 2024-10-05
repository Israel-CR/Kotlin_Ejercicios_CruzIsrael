package Bucles

fun main() {
//    28.Números primos: Pide un número e indica si es primo o no.
    var numero: Int;
    var esPrimo = true;

    while (true) {
        try {
            print("Escribe un numero: ")
            numero = readln().toInt()
            for (i in 2..<numero) {
                if (numero % i == 0) {
                    esPrimo = false
                    break;
                }
            }
            if (esPrimo) {
                println("El numero $numero es primo")
            } else {
                println("El numero $numero no es primo")
            }
            break
        } catch (e: NumberFormatException) {
            println("Error: numero invalido, intente de nuevo")
        }
    }
}