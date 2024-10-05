package Condicionales

fun main(){
//    17.Descuento en tienda: Pide el precio de un producto y aplica un
//    descuento del 20% si supera los 1000.

    var precio:Double;


    while (true){
        try {
            print("Escribe el precio del producto: ")
            precio= readln().toDouble()

            if(precio>=1000){
                val descuento= precio * 0.20;
                val total= precio-descuento;
                println("""
                    precio del producto: $precio 
                    Descuento 20%: $descuento
                    Total: $total
                    """.trimIndent())
            } else{
                println("El producto no tiene descuento, Total: $precio")
            }
            break;

        }catch (e:NumberFormatException){
            println("Error: numeros invalidos, intente de nuevo")
        }
    }
}