
fun main(){
//    2. Conversión de grados Celsius a Fahrenheit: Crea un programa que
//    convierta una temperatura dada en grados Celsius a Fahrenheit.

    var gradoC:Double;
    var gradoF:Double;

    while (true){
        try {
            println("Escribe los grados en Celcius")
            gradoC= readln().toDouble()
            gradoF= (gradoC * 9/5) + 32
            println("$gradoC grados Celcuis equivale a $gradoF grados Fahrenheit");
            break;
        }catch (e: NumberFormatException){
            println("ERROR:Escribe un numero valido")
        }
    }

}