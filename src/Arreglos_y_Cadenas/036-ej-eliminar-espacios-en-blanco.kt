package Arreglos_y_Cadenas

fun main() {
//    36.Eliminar espacios en blanco: Dada una cadena, elimina todos los
//    espacios en blanco.
    print("Escribe una cadena: ")
    val cadena = readln().toString()
    var cadenaSinEspacios = ""

    for (i in cadena) {
        if (i != ' ') {
            cadenaSinEspacios += i
        }
    }
    println("La cadena sin espacios es: $cadenaSinEspacios")


}