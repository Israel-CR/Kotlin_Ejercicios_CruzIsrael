package Arreglos_y_Cadenas

fun main() {
//    33.Revertir una cadena: Pide una cadena y muestra su reverso.

    print("Escribe una cadena: ")
    val cadena = readln().toString()
    var cadenaRevertida = ""

    for (i in cadena.length - 1 downTo 0) {
        cadenaRevertida += cadena[i]
    }
    println("La cadena revertida es: $cadenaRevertida")
}