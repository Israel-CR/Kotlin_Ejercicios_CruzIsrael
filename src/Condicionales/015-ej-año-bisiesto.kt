fun main(){
//    15.Año bisiesto: Escribe un programa que determine si un año es
//            bisiesto.

    var año:Int;


    while (true){
        try {
            print("Escribe el año: ")
            año= readln().toInt()

            if(año%4==0 && (año % 100 !=0 || año% 400 == 0)){
                println("$año es un año bisiesto")
            }else{
                println("$año no es     es un año bisiesto")
            }
            break;

        }catch (e:NumberFormatException){
            println("Error: numeros invalidos, intente de nuevo")
        }
    }
}