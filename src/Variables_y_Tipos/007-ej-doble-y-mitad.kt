fun main(){
//    7. Doble y mitad: Pide un número y muestra su doble y su mitad.

    var numero:Double;
    var doble:Double;
    var mitad:Double;
    while (true){
        try {
            print("Escribe un numero: ")
            numero= readln().toDouble()
            doble= numero*2;
            mitad=numero/2;
            println("La mitad de $numero es: $mitad y el doble es: $doble")
            break;

        }catch (e:NumberFormatException){
            println("ERROR:Escribe numeros Validos, intente de nuevo")
        }
    }
}