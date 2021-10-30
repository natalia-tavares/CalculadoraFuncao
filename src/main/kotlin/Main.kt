import kotlin.math.pow

fun main(args: Array<String>) {

    println("Informe o primeiro numero ")
    var num1= readLine()!!.toDouble()
    println("Informe o segundo numero ")
    var num2= readLine()!!.toDouble()
    println("Todas as operações")
    Soma(num1,num2)
    Subtracao(num1,num2)
    Mult(num1,num2)
    Div(num1,num2)
    Potencia(num1, num2)

    println("Escolha uma operacao +(Soma)\n-(Subtracao)\n*(Multiplicacao)\n/(Divisao)\n**(potencia)")
    var escolha= readLine()!!

    when(escolha){
        "+" ->  + Soma(num1,num2)
        "-"->Subtracao(num1,num2)
        "*"   ->    Mult(num1,num2)
        "/"->  Div(num1,num2)
        "**"->Potencia(num1, num2)
    }
}

fun Soma(num1:Double,num2:Double):Double{
    var soma =num1+num2
    println("O valor de soma é igual a $soma\n")
    return soma
}
fun Subtracao(num1:Double,num2:Double):Double{
    var subtracao =num1-num2
    println("O valor de Subtracao é igual a $subtracao\n")
    return subtracao

}
fun Mult(num1:Double,num2:Double):Double{
    var mult=num1*num2
    println("O valor da multiplicacao é igual a $mult\n")
    return mult
}

fun Div(num1:Double,num2:Double):Double{
    var  div= (num1/num2)
    println("O valor de divisao é igual a $div\n")
    return div
}
fun Potencia(num1:Double,num2:Double):Double{
    var potencia= num1.pow(num2)
    println("O valor de potencia é igual a $potencia\n")
    return potencia

}