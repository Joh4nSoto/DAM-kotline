fun main(){
    val numeros = mutableListOf(30,4,11,21,7,35)

    //Cree una lista con todos los elementos pares.
    val numeros_pares = numeros.filter { it%2==0 }

    //Encuentre el primer elemento que sea menor a 10.
    val primer_elemento_menor_a_10 = numeros.find { it<10 }

    //Multiplique cada elemento de la lista por 2.
    val multix2 = numeros.map { it*2 }

    //Sume el primer y el último elemento de la lista.
    val primer_elemento = numeros.first()
    val ultimo_elemento = numeros.last()
    val primero_mas_ultimo = primer_elemento+ultimo_elemento

    //Agregue [ 4, 4, 4] a la variable números.
    for (i in 1..3) {
        numeros.add(4)
    }
    println(numeros)

    //Encuentre el primer elemento que sea divisible por 7
    val primer_elemento_divisible_en_7 = numeros.find { it%7==0 }
    println(primer_elemento_divisible_en_7)

    //Sume todos los elementos que sean pares.
    val suma_numeros_pares = numeros_pares.sum()

    //Encuentre el primer elemento que sea impar y mayor a 10.
    val primer_elemento_impar_mayor_a_10 = numeros.find { it%2!=0 || it>10 }
    println(primer_elemento_impar_mayor_a_10)

    //ULTIMOS EJERCICIOS

    //Verifique si a es mayor que b
    fun verificador_a_mayor_que_b(a:Int,b:Int):Boolean{
        if(a>b){
            return true
        }else{
            return false
        }
    }
    var b = 5
    for(i in 0..10){
        println("El numero $i es mayor que $b? ="+verificador_a_mayor_que_b(i,b))
    }

    //multiplique a con b
    fun multiplicar(a:Int,b:Int):Int{
        return a*b
    }

    //cuente desde a hasta b
    var a = 10
    b = 20
    fun contar_de_a_hasta_b(a:Int,b:Int){
        for(i in a..b){
            println(i)
        }
    }
    contar_de_a_hasta_b(a,b)

    //pregunte si a es impar
    fun a_es_impar(a:Int):Boolean{
        if(a%2==0){
            return true
        }else{
            return false
        }
    }

    //pregunte si a es mayor a 100
    fun a_es_mayor_que_100(a:Int){
        if(a>100){
            println("$a es mayor que 100")
        }else{
            println("$a es menor que 100")
        }
    }

    //multiplique a x b x c
    fun multiplicar_a_b_c(a:Int,b:Int,c:Int):Int{
        return a*b*c
    }

    //diga si a, b y c son todos pares
    fun a_b_c_son_pares(a:Int,b:Int,c:Int){
        var lista_numeros = mutableListOf(a,b,c)
        for(i in lista_numeros){
            if(i)
        }
    }

}