fun main(){
//    5. Promedio de tres números: Solicita tres números y calcula su
//    promedio.

    var num1:Double;
    var num2:Double;
    var num3:Double;

    var promedio:Double;

    while (true){
        try {
            print("Escribe el primer numero: ");
            num1= readln().toDouble();
            print("Escribe el segundo numero: ");
            num2= readln().toDouble();
            print("Escribe el tercer numero: ");
            num3= readln().toDouble();
            promedio=(num1+num2+num3)/3
            println("El promedio de $num1 , $num2 , $num3 es: $promedio")
            break;
        }catch (e:NumberFormatException){
            println("ERROR: Escribe numero validos, Intenta de nuevo")
        }
    }
}