fun main(){
//    6. Conversión de String a Int: Lee una cadena y conviértela a un
//    entero, manejando posibles errores.

    var cadena:String;
    var entero: Double?;

    while (true){
        try {
            print("Escribe la cadena de texto para convertirlo a un Entero: ")
            cadena= readln()
            entero= cadena.toDouble()
            break;
        }catch (e:NumberFormatException){
            println("No fue posible convertir el valor proprcionado a un entero, intente de nuevo")
        }
    }

    println("El texto proporcinado a entero es: ${entero?.toInt()}")
}