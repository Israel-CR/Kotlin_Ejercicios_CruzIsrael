package Bucles

fun main() {
//    23.Tabla de multiplicar: Pide un número e imprime su tabla de
//    multiplicar del 1 al 10.

        var numero: Int;

        while (true) {
            try {
                print("Escribe un numero: ")
                numero = readLine()!!.toInt()
                println("Tabla de multiplicar del $numero")
                for (i in 1..10) {
                    println("$numero x $i = ${numero * i}")
                }
                break
            } catch (e: NumberFormatException) {
                println("Error: numero invalido, intente de nuevo")
            }
        }
}