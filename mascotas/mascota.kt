package mascotas

open class Mascota(var tipo:String, var nombre:String, var edad:Int){
    open fun mostrarInfo():String{
        return "soy un $tipo, me llamo $nombre y tengo $edad años"
    }
}
