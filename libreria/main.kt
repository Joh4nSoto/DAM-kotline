package libreria

import libreria.models.Libro
import libreria.models.Categoria

fun main(){
    var categoria_terror = Categoria(1,"terror")
    var libro_1 = Libro("RB303","El conjuro 4", categoria_terror, "La ultima pelicula de la Saga")
    println(libro_1.toString())
}