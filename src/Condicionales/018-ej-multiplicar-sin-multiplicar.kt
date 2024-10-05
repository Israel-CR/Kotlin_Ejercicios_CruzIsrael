package Condicionales

fun main(){
//    18.Multiplicación sin multiplicar: Multiplica dos números sin usar el
//    operador de multiplicación.

   val num1:Int= -9 ;
   val num2:Int= 4;

    var resultado = 0

    // si alguno de los numeros es cero
    if (num1 == 0 || num2 == 0) {
        resultado=0
    }else if (num2 < 0 && num1>0) {
        //    si el primero es negativo
        for (i in 1..num1) {
            resultado += num2
        }
    }else if(num1 < 0 && num2>0){
        //    si el segundo es negativo
        for (i in 1 .. num2) {
            resultado += num1
        }

}else if (num1 < 0 && num2 < 0) {
        // si los dos numeros son negativos
    for (i in 1..-num1) {
        resultado += -num2
    }
} else {
        // Caso general: ambos números positivos
        for (i in 1..num2) {
            resultado += num1
        }
    }
    println(resultado)
}