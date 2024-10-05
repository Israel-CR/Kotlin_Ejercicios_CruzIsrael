package Arreglos_y_Cadenas

fun main() {
//    35.Concatenar dos cadenas: Pide dos cadenas e imprímelas juntas.
    print("Escribe la primera cadena de texto: ")
    val cadena1 = readln().toString()
    print("Escribe la segunda cadena de texto: ")
    val cadena2 = readln().toString()

    println("Las cadenas concatenadas son: ${cadena1 + cadena2}")
}