package libreria

import libreria.controllers.CategoriaController
import libreria.controllers.LibroController
import libreria.models.Libro
import libreria.models.Categoria

fun main(){
    var cc = CategoriaController()
    var lc = LibroController()
    cc.listarCategorias()
}