package Bucles

fun main(){
//    22.Suma de los primeros n números: Dado un número n, calcula la
//    suma de los primeros n números naturales.

    var n:Int;
    var suma=0;

    while (true){
        try {
            print("Escribe un numero: ")
            n= readln().toInt()
            for (i in 1..n){
                suma+=i
            }
            println("La suma de los primeros $n numeros es: $suma")
            break;
        }catch (e:NumberFormatException){
            println("Error: numeros invalidos, intente de nuevo")
        }
    }
}