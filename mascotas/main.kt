package mascotas

fun main(){
    var mascota_1 = Pez("pez","pepe",21, true)
    var mascota_2 = Gato("gato","bell",4, "negro")
    var mascota_base = Mascota("perro","firulais",4)
    println(mascota_1.mostrarInfo())
    println(mascota_2.mostrarInfo())
    println(mascota_base.mostrarInfo())
}