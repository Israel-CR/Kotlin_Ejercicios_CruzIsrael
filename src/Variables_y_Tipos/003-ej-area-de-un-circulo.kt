fun main(){
//    3. Área de un círculo: Escribe un programa que calcule el área de un
//            círculo, dado su radio.

    var radio:Double;
    var area:Double;
    val pi:Double=3.1416;

    while (true){
        try {
            println("Escribe la radio del curculo para calcular su area:");
            radio= readln().toDouble()
            area= pi*(radio*radio);
            println("El area de un circulo con radio $radio es: $area")
            break;
        }catch (e:NumberFormatException){
            println("ERROR: Escribe un numero valido")
        }
    }

}

