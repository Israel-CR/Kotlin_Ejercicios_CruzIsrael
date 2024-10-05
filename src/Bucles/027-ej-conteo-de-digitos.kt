package Bucles

fun main() {
//    27.Conteo de dígitos: Pide un número entero y cuenta cuántos dígitos
//    tiene.
    var numero: Int;
    var contador = 0;

    while (true) {
        try {
            print("Escribe un numero entero: ")
            numero = readln().toInt()
            var num = numero
//            si el numero es negativo convertirlo a positivo
            if (num<0) {
                num*=-1
            }
            while (num > 0 ) {
                contador++
                num /= 10
            }
            println("El numero $numero tiene $contador digitos")
            break
        } catch (e: NumberFormatException) {
            println("Error: numero invalido, intente de nuevo")
        }
    }
}