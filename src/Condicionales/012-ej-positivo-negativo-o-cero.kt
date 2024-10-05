fun main(){
//    12.Positivo, negativo o cero: Dado un número, indica si es positivo,
//    negativo o cero.
    var num: Double;

    while (true){
        try {
            print("Escribe un numero: ")
            num= readln().toDouble()

            if(num<0){
                println("El numero es negativo")
            }else if(num>0){
                println("El numero es Positivo")
            } else{
                println("El numero es cero")
            }
            break;

        }catch (e:NumberFormatException){
            println("Error: numeros invalidos, intente de nuevo")
        }
    }
}