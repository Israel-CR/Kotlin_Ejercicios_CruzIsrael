fun main(){
//    8. Conversión de metros a kilómetros: Convierte una distancia dada
//    en metros a kilómetros.

    var metros:Double;
    var km:Double;

    while(true){
        try {
            print("Escribe el numero de metros: ")
            metros= readln().toDouble()
            if (metros>=0){
                km= metros/1000
                println("$metros metros equivale a $km kilometros")
                break;
            }else{
                println("El numero de metros no debe ser negativo")
            }
        }catch (e:NumberFormatException){
            println("ERROR: Escribe un numero valido, intente de nuevo")
        }
    }
}