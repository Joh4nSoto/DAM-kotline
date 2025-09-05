package mascotas

class Pez(tipo:String, nombre:String, edad:Int, var sangreFria:Boolean):Mascota(tipo, nombre, edad){
    override fun mostrarInfo():String {
        return "soy un $tipo, me llamo $nombre y tengo $edad años, soy sangre fria? = $sangreFria"
    }
}