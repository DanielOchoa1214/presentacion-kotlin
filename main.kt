
fun main(args: Array<String>) {
    println("Escriba la operacion que desea realizar: ")
    var operation = readLine()
    while(operation != ""){
        var data = operation!!.split(" ")
        var result = 0
        when(data[1]){
            "+" -> higherOrder(data[0].toFloat(), data[2].toFloat(), sum)
            "-" -> higherOrder(data[0].toFloat(), data[2].toFloat(), rest)
            "*" -> higherOrder(data[0].toFloat(), data[2].toFloat(), mult)
            "/" -> higherOrder(data[0].toFloat(), data[2].toFloat(), divd)
        }
        operation = readLine()
    }
}

//Funciones como parametros
var sum = {a : Float, b : Float -> a + b}
var rest = {a : Float, b : Float -> a - b}
var mult = {a : Float, b : Float -> a * b}
var divd = {a : Float, b : Float -> a / b}

fun higherOrder(num1: Float, num2: Float, function : (Float, Float) -> Float){
    val result = function(num1, num2)
    println("El resultado es: $result")
}

// Funciones "normales"
fun add(x : Float, y : Float) : Float{
    return x + y
}

fun substract(x : Float, y : Float) : Float{
    return x - y
}

fun multiply(x : Float, y : Float):Float{
    return x * y;
}

fun divide(x : Float, y : Float): Float{
    return x / y
}


