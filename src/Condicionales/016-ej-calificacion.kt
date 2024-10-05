fun main(){
//    16.Calificación: Dada una calificación numérica (0-100), convierte y
//    muestra la letra correspondiente (A, B, C, D o F).


    var calificacion: Int;

    while (true){
        try {
            print("Escribe su claificacion:(escala [1-100]): ")
            calificacion= readln().toInt()


            when {
                calificacion in 90..100 -> println("tu calificacion es: A ")
                calificacion in 80..90 ->println("tu calificacion es: B ") // Muy Bueno (80-89)
                calificacion in 70..80 -> println("tu calificacion es: C ") // Bueno (70-79)
                calificacion in 60..70 -> println("tu calificacion es: D ") // Regular (60-69)
                calificacion in 0..60 -> println("tu calificacion es: F ") // Insuficiente (0-59)
                else -> println("calificacion invalida")
            }
            break;

        }catch (e:NumberFormatException){
            println("Error: numero invalido, intente de nuevo")
        }
    }



}