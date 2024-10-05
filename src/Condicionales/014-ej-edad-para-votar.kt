fun main(){
//    14.Edad para votar: Pregunta la edad del usuario y muestra si puede
//    votar o no (mayor de 18 años).

    var edad: Int;

    while (true){
        try {
            print("Escribe tu edad: ")
            edad= readln().toInt()

            if(edad>=18){
                println("Tienes edad para votar")
            }else {
                println("Aun no tienes edad para votar")
            }
            break;

        }catch (e:NumberFormatException){
            println("Error: numero invalido, intente de nuevo")
        }
    }

}