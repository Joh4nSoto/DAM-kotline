package mascotas

class Gato(tipo:String, nombre:String, edad:Int, var colorPelaje:String):Mascota(tipo, nombre, edad){
    override fun mostrarInfo():String {
        return "soy un $tipo, me llamo $nombre y tengo $edad años, mi color de pelo es $colorPelaje"
    }
}