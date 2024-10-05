fun main(){
//    9. Número par o impar: Lee un número y determina si es par o impar.
var numero:Int;

while(true){
    try {
        print("Escribe un numero: ")
        numero= readln().toInt()
        val mensaje= if(numero%2===0)"$numero es un numero par" else "$numero es un numero impar"
        println(mensaje)
        break;
    }catch (e:NumberFormatException){
        println("ERROR: Escribe un numero valido, intente de nuevo")
    }
}
}