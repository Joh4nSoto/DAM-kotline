fun main() {
    var lista = listOf(1, 2, 5)//[1,2,5] inmutable
    var lista2 = mutableListOf(1, 2, 5)//[1,2,5] mutable
    println("lista:$lista")
    println("lista mutable:$lista2")

    var conjunto = mutableSetOf(1, 2, 5)//no guarda datos repetidos
    conjunto.add(1)
    println("conjunto:$conjunto")

    var mapa = mapOf("nombre" to "juan", "edad" to 9, "dolares" to 1000)
    println("mapa:$mapa")

    val numeros = listOf(1, 2, 3, 4, 5, 6)
    var n = numeros.filter { it % 2 == 0 }//filtra la lista y trae todos los elementos que cumplan la condicion
    println(n)

    var m = numeros.map { it*2 }//calcula todos los elementos de la lista
    println(m)

    var sumatoria = numeros.sum()//suma el total de los elementos de la lista
    println(sumatoria)

    var buscar = lista.find { it % 2 == 0 }//busca el primer elemento de la lisa
    println(buscar)

    var primero = numeros.first()//primer elemento de la lista
    println(primero)

    var ultimo = numeros.last()//ultimo elemento de la lista
    println(ultimo)

    for(i in lista){
        println("elemento de la lista:$i")
    }

    var informacion = mapOf("nombre" to "fernanda","edad" to 29)
    informacion.forEach{
        (key,value) -> println("la llave es $key -> y el valor es $value")
    }
}