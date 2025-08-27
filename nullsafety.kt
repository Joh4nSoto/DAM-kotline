fun main() {
    println("inicio de programa")
    fun suma(a:Int, b:Int):Int{
        return a+b;
    }

    fun res(a:Int, b:Int):Int{
        return a-b;
    }

    fun mul(a:Int, b:Int):Int{
        return a*b;
    }

    fun div(a:Float, b:Float):Float{
        return a/b;
    }

    fun mod(a:Float, b:Float):Float{
        return a%b;
    }
    fun esPar(a:Int):String{
        if(a%2==0){
            return "es par"
        }else{
            return "es impar"
        }
    }
    for(n in 1..10){
        println("$n = "+esPar(n))
    }
    fun esmayor(edad:Int):String{
        var msg:String = ""
        when(edad){
            in 0..18 -> msg="es mayor"
            in 19..1000 -> msg="es menor"
        }
        return "La edad de $edad años $msg de edad"
    }
    println(esmayor(18))
    //EJERCICIO 1 saltar el 5 y entre el 11 al 19
    for (i in 1..20) {
        if (i == 5 || i in 11..19) {
            continue  // Salta el número 5 y los del 11 al 19
        }
        println(i)
    }
    fun ciclo_do_while(){
        var i = 1;
        var ciclos =1;
        do {

            ciclos++;
            val randomNumber= (0..10).random()
            i = i + randomNumber
            println("ciclo $ciclos : $i")

        } while (i <=300)
    }
    ciclo_do_while()
    fun dividir(a: Int, b:Int){
        println("voy a dividir $a entre $b")
        if( b != 0){
            println(a / b)
        }
        else {
            println("no se puede dividir por cero")
        }
    }
    dividir(2,6)
}