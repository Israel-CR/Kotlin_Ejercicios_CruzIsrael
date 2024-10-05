package Bucles

fun main() {
//    25.Factorial: Calcula el factorial de un número dado.
    var numero: Int;
    var factorial = 1;

    while (true) {
        try {
            print("Escribe un numero: ")
            numero = readln().toInt()
            for (i in 1..numero) {
                factorial *= i
            }
            println("El factorial de $numero es: $factorial")
            break
        } catch (e: NumberFormatException) {
            println("Error: numero invalido, intente de nuevo")
        }
    }
}