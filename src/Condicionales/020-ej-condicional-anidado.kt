package Condicionales

fun  main(){
//    20.Condicional anidado: Pide un número del 1 al 12 y muestra el mes
//    correspondiente.

    var mes:Int;

    while (true){
        try {
            print("Escribe un numero del 1 al 12: ")
            mes= readln().toInt()

            if(mes in 1..12){
                if(mes==1){
                    println("Enero")
                }else if(mes==2){
                    println("Febrero")
                }else if(mes==3){
                    println("Marzo")
                }else if(mes==4){
                    println("Abril")
                }else if(mes==5){
                    println("Mayo")
                }else if(mes==6){
                    println("Junio")
                }else if(mes==7){
                    println("Julio")
                }else if(mes==8){
                    println("Agosto")
                }else if(mes==9){
                    println("Septiembre")
                }else if(mes==10){
                    println("Octubre")
                }else if(mes==11){
                    println("Noviembre")
                }else{
                    println("Diciembre")
                }
                break;
            }else{
                println("Numero invalido, intente de nuevo")
            }
        }catch (e:NumberFormatException){
            println("Error: numeros invalidos, intente de nuevo")
        }
    }

}