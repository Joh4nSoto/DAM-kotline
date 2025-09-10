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
    cc.listarCategorias()
    while(encendido){
        println("---Bienvenido a la biblioteca---")
        println("1) Listar los libros")
        println("2) Agregar un libro")
        println("3) Editar un libro")
        println("4) Eliminar un libro")
        println("5) Salir")
        if(opcion()==1){
            println("Como deseas listarlos?")
            println("1) Mostrar todos")
            println("2) Filtrar por categoria")
            opcion()
        }else if(opcion()==2){
            println("Seleccionaste 2")
        }
    }

}