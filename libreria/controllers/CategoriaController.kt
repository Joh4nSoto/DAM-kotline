package libreria.controllers

import libreria.models.Categoria
import libreria.models.Libro

open class CategoriaController() {
    var id:Int = 0
    var categorias: MutableList<Categoria> = mutableListOf()
    init{
        var categoria_terror = Categoria(id++,"Terror")
        var categoria_comedia = Categoria(id++,"Comedia")
        var categoria_drama = Categoria(id++,"Drama")
        var categoria_ficcion = Categoria(id++,"Ciencia Ficcion")
        categorias.addAll(listOf(categoria_terror,categoria_comedia,categoria_drama,categoria_ficcion))
    }

    open fun listarCategorias() {
        println("Lista de categorias:")
        for (categoria in categorias) {
            println(categoria.toString())
        }
    }

    open fun obtenerCategoria(id: Int): Categoria? = categorias.find { it.id == id }

    open fun obtenerLista(): MutableList<Categoria>{
        return categorias
    }
}