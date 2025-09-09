package libreria.models

open class Libro(var isbn:String,var titulo:String,var categoria:Categoria,var descripcion:String){
    override fun toString(): String {
        return "(isbn: $isbn, titulo: $titulo, categoria: $categoria, descripcion: $descripcion)"
    }
}