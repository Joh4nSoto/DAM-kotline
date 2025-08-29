import Pokemon
import java.util.Scanner
fun main(){
    val scanner = Scanner(System.`in`)
    val charmander = Pokemon("charmander",40,1000)
    val pikachu = Pokemon("pikachu",60,550)
    val pokemones = mutableListOf(charmander,pikachu)
    charmander.sePreparaParaLaBatalla()
    charmander.informacion()
    println("Presiona 1 para atacar")
    while(true){
        var opc = 0
        opc = readln().toInt()
        if(opc==1){
            pikachu.informacion()
            pikachu.recibir_daño(charmander)
        }
    }
}