package libreria

import libreria.controllers.CategoriaController
import libreria.controllers.LibroController
import libreria.models.Libro
import libreria.models.Categoria

fun main(){
    fun opcion():Int{
        while(true) {
            try {
                var opc = readln().toInt()
                return opc
            } catch (e: Exception) {
                // Code to handle the specific exception
                println("Error inseperado: ${e.message}")
                println("Ingrese nuevamente")
            }
        }
    }
    var encendido: Boolean = true
    var cc = CategoriaController()
    var lc = LibroController()
    while(encendido){
        println("---Bienvenido a la biblioteca---")
        println("1) Listar los libros")
        println("2) Agregar un libro")
        println("3) Editar un libro")
        println("4) Eliminar un libro")
        println("5) Salir")
        var opc = opcion()
        if(opc==1){
            println("Como deseas listarlos?")
            println("1) Mostrar todos")
            println("2) Filtrar por categoria")
            opc = opcion()
            if(opc==1){
                lc.listarLibros()
            }else if(opc==2){
                println("Ingrese la id de la categoria que desee listar")
                cc.listarCategorias()
                var id = opcion()
                lc.listarLibrosPorCategoria(cc.obtenerLista().find { it.id == id }!!)
            }
        }else if(opc==2){
            println("ingrese el titulo del nuevo libro: ")
            var titulo = readln()
            println("ingrese la id de la categoria del nuevo libro: ")
            cc.listarCategorias()
            var categoria = cc.obtenerCategoria(readln().toInt())
            println("ingrese una descripcion breve del libro: ")
            var descripcion = readln()
            lc.agregarLibro(titulo,categoria!!,descripcion)
        }else if(opc==3){
            lc.listarLibros()
            println("ingrese el isbn del libro que desea editar")
            var isbn = readln()
            var libro_editar = lc.buscarLibro(isbn)
            println("Libro $libro_editar encontrado para editar")
            println("ingrese el nuevo titulo del libro: ")
            var titulo = readln()
            println("ingrese la id de la categoria del libro: ")
            cc.listarCategorias()
            var categoria = cc.obtenerCategoria(readln().toInt())
            println("ingrese una descripcion breve del libro: ")
            var descripcion = readln()
            lc.editarLibro(isbn,titulo,categoria!!,descripcion)
        }else if(opc==4){
            lc.listarLibros()
            println("ingrese el isbn del libro que desea eliminar")
            var isbn = readln()
            var libro_eliminar = lc.buscarLibro(isbn)
            println("Libro $libro_eliminar encontrado para eliminar")
            println("Deseas eliminar este libro?")
            println("1) Si")
            println("2) No")
            var opc = opcion()
            if(opc==1){
                lc.eliminarLibro(isbn)
            }else if(opc==2){
                continue
            }
        }else if(opc==5){
            encendido = false
        }else{
            println("Ingresa una opcion valida")
        }
    }
}