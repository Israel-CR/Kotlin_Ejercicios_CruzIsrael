fun main(){
//    13.implementa una calculadora simple que sume,
//    reste, multiplique o divida según la entrada del usuario.




    var num1: Double;
    var num2:Double;
    var operacion:Int;

    while (true){
        println("Calculadora Basica")

        try {
            print("Escribe el primer numero: ")
            num1= readln().toDouble()
            print("Escribe el segundo numero: ")
            num2= readln().toDouble()
            println("""
                Elige la operacion a realizar con los numeros proporcionados:
                1.- SUMA
                2.- RESTA
                3.- MULTIPPLICACION
                4.- DIVISION
            """.trimIndent())

            operacion= readln().toInt()

            when(operacion){
                1-> {
                    val suma=num1+ num2;
                    println("SUMA")
                    println(" $num1 + $num2 = $suma")
                };
                2-> {
                    val resta=num1+ num2;
                    println("RESTA")
                    println(" $num1 + $num2 = $resta")
                };
                3-> {
                    val mult=num1+ num2;
                    println("MULTIPLICACIÓN")
                    println(" $num1 * $num2 = $mult")
                };
                4-> {
                    val division=num1+ num2;
                    if (num2===0.0){
                        println("No es posible dividir entre cero")
                    }else{
                        println("DIVISIÓN")
                        println(" $num1 / $num2 = $division")
                    }
                }
                else->{
                    println("Operación invalida")
                }
            }
            break;
        }catch (e:NumberFormatException){
            println("Error: numeros invalidos, intente de nuevo")
        }
    }
}