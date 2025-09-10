package libreria

import libreria.controllers.CategoriaController
import libreria.controllers.LibroController
import libreria.models.Libro
import libreria.models.Categoria

fun main(){
    fun limpiar(){
        Runtime.getRuntime().exec("cls")
    }
    fun opcion(){
        var opcion_correcta = false
        while(opcion_correcta!=true){
            var opc = readln().toInt()
            if(opc > 0 || opc < 6){
                println("Ingresa un numero dentro del rango")
            }
        }


    }
    var encendido: Boolean = true
    var cc = CategoriaController()
    var lc = LibroController()
    cc.listarCategorias()
    while(encendido){
        limpiar()
        println("---Bienvenido a la biblioteca---")
        println("1) Listar los libros")
        println("2) Agregar un libro")
        println("3) Editar un libro")
        println("4) Eliminar un libro")
        println("5) Salir")
        var opc = readln().toInt()
        if(opc==1){
            println("Seleccionaste 1")
            opc = readln().toInt()
        }else if(opc==2){
            println("Seleccionaste 2")
        }
    }

}