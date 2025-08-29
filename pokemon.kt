class Pokemon(
    val nombre: String,
    var atk: Int,
    var hp: Int
){
    fun sePreparaParaLaBatalla(){
        println("el $nombre se prepara para la batalla")
    }
    fun informacion(){
        println("Pokemon:$nombre")
        println("ATK:$atk HP:$hp")
    }
    fun atacar():Int{
        return this.atk
    }
    fun recibir_daño(pokemon_atacante: Pokemon){
        println("${pokemon_atacante.nombre} ha atacado $nombre, -${pokemon_atacante.atk} de HP a $nombre")
        this.hp -= pokemon_atacante.atk
        if(hp<=0){
            println("$nombre se murio!")
        }
    }
}