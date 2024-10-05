
fun main(){
//    1. Suma de dos números: Escribe un programa que solicite dos
//    números al usuario y muestre su suma.

    var num1:Double;
    var num2:Double;


    while (true){
        try {
            println("Escribe el primer numero:");
            num1 = readln().toDouble()
            println("Escribe el segundo numero:");
            num2= readln().toDouble()

            val suma= num1 + num2;
            println("la suma de $num1 y $num2 es: $suma")
            break;
        }catch (error: NumberFormatException){
            println("ERROR: Escribe un numero valido");
        }
    }


}