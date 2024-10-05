fun main(){
//    10.Día de la semana: Pide un número del 1 al 7 y muestra el día de la
//    semana correspondiente.

    var numero:Int;

    while(true){
        try {
            print("Escribe un numero de 1 al 7: ")
            numero= readln().toInt()
            when(numero){
                1-> println("$numero corresponde a Lunes")
                2-> println("$numero corresponde a Martes")
                3-> println("$numero corresponde a Miercoles")
                4-> println("$numero corresponde a Jueves")
                5-> println("$numero corresponde a Viernes")
                6-> println("$numero corresponde a Sabado")
                7-> println("$numero corresponde a Domingo")
                else-> println("$numero no corresponde a ningun dia de la semana")
            }
            break;

        }catch (e:NumberFormatException){
            println("Error: El numero proporcionado no es valido, intente de nuevo")
        }
    }
}