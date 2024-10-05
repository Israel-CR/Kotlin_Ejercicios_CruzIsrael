package Condicionales

fun main(){
//    19.Ordenar tres números: Solicita tres números y muestra el mayor, el
//    intermedio y el menor.

    var num1: Double;
    var num2:Double;
    var num3:Double;

    var numMayor:Int;
    var numIntermedio:Int;
    var numMenor:Int;

    while (true){
        try {
            print("Escribe el primer numero: ")
            num1= readln().toDouble()
            print("Escribe el segundo numero: ")
            num2= readln().toDouble()
            print("Escribe el tercer numero: ")
            num3= readln().toDouble()

            if(num1>num2 && num1>num3){
                numMayor=num1.toInt();
                if(num2>num3){
                    numIntermedio=num2.toInt();
                    numMenor=num3.toInt();
                }else{
                    numIntermedio=num3.toInt();
                    numMenor=num2.toInt();
                }

            }else if(num2>num1 && num2>num3){
                numMayor=num2.toInt();
                if(num1>num3){
                    numIntermedio=num1.toInt();
                    numMenor=num3.toInt();
                }else{
                    numIntermedio=num3.toInt();
                    numMenor=num1.toInt();
                }
            }else{
                numMayor=num3.toInt();
                if(num1>num2){
                    numIntermedio=num1.toInt();
                    numMenor=num2.toInt();
                }else{
                    numIntermedio=num2.toInt();
                    numMenor=num1.toInt();
                }
            }

            println("""
                ----------------
                Mayor: $numMayor
                Intermedio: $numIntermedio
                Menor: $numMenor
                ----------------
            """.trimIndent())

            break;

        }catch (e:NumberFormatException){
            println("Error: numeros invalidos, intente de nuevo")
        }
    }
}