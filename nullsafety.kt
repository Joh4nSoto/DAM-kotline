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
}