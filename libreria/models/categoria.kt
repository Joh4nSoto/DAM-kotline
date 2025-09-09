package libreria.models

open class Categoria(var id:Int,var categoria:String){

    override fun toString(): String {
        return "(id: $id, categoria: $categoria)"
    }
}