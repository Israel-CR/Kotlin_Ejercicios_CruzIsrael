package Bucles

fun main() {
//    26.Sumar dígitos de un número: Lee un número entero y calcula la
//    suma de sus dígitos.



    var numero: Int;
    var suma = 0;

    while (true) {
        try {
            print("Escribe un numero entero: ")
            numero = readln().toInt()
            var num = numero
            while (num > 0) {
                suma += num % 10
                num /= 10
            }
            println("La suma de los digitos de $numero es: $suma")
            break
        } catch (e: NumberFormatException) {
            println("Error: numero invalido, intente de nuevo")
        }
    }
}