package Bucles

fun main() {
//    30.Invertir número: Dado un número entero, invierte el orden de sus
//    dígitos.
    var numero: Int;
    var invertido = 0;

    while (true) {
        try {
            print("Escribe un numero entero: ")
            numero = readln().toInt()
            var num = numero
            while (num > 0) {
                invertido = invertido * 10 + num % 10
                num /= 10
            }
            println("El numero invertido de $numero es: $invertido")
            break
        } catch (e: NumberFormatException) {
            println("Error: numero invalido, intente de nuevo")
        }
    }
}