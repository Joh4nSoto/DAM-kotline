package libreria.controllers

import libreria.models.Categoria
import libreria.models.Libro

open class LibroController(){
    var id:Int = 0
    var libros: MutableList<Libro> = mutableListOf()
    open fun buscarLibro(isbn: String):Libro? = libros.find { it.isbn == isbn }

    open fun listarLibros(){
        println("Lista de los libros:")
        for(libro in libros){
            println(libro.toString())
        }
    }

    open fun listarLibrosPorCategoria(categoria: Categoria){
        var librosPorCategoria = libros.filter { it.categoria==categoria }
        if (librosPorCategoria != null){
            for (libro in librosPorCategoria){
                println(libro.toString())
            }
        }else{
            println("Esta categoria no contiene libros aun")
        }
    }

    open fun agregarLibro(titulo:String,categoria:Categoria,descripcion:String){
        id++
        var libro_nuevo = Libro("lib"+id.toString(),titulo,categoria,descripcion)
        libros.add(libro_nuevo)
        println("Libro $titulo se ha agregado!")
    }

    open fun editarLibro(isbn:String,titulo:String,categoria:Categoria,descripcion:String){
        var libro_editar = buscarLibro(isbn)
        if(libro_editar!=null){
            libro_editar.titulo = titulo
            libro_editar.categoria = categoria
            libro_editar.descripcion = descripcion
            println("Libro $isbn actualizado!, $titulo ")
        }else{
            println("Libro no encontrado")
        }
    }

    open fun eliminarLibro(isbn: String){
        var libro_eliminar = buscarLibro(isbn)
        libros.remove(libro_eliminar)
        println("Libro eliminado correctamente!")
    }
}