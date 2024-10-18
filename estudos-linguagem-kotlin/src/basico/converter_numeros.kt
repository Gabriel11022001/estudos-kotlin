package basico

fun main() {
    val numero1: Int = 22
    // converter inteiro para double
    println(numero1.toDouble())

    // converter double para inteiro
    val numero2: Double = 22.0
    val numeroInteiroConvertidoPorDouble: Int = numero2.toInt()

    println(numeroInteiroConvertidoPorDouble)

    // no caso abaixo, o .12 vai ser perdido
    val numero3: Double = 10.12
    println(numero3.toInt())
}