fun main(){
//    11.Mayor de dos números: Solicita dos números y muestra el mayor de
//    ellos.

    var num1: Double;
    var num2:Double;

    while (true){
        try {
            print("Escribe el primer numero: ")
            num1= readln().toDouble()
            print("Escribe el segundo numero: ")
            num2= readln().toDouble()
            if(num1>num2){
                println("$num1 es mayor que $num2")
            }else if(num1<num2){
                println("$num2 es mayor que $num1")
            } else{
                println("Los numeros son iguales")
            }
            break;

        }catch (e:NumberFormatException){
            println("Error: numeros invalidos, intente de nuevo")
        }
    }
}