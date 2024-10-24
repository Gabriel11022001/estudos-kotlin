package basico

fun main() {
    val valor = 11

    if (valor > 0) {
        println("positivo!")
    } else if (valor < 0) {
        println("negativo")
    } else {
        println("valor é zero")
    }

    println("informe sua idade:")
    val idade = readln()!!.toInt()

    if (idade > 120 || idade < 0) {
        println("idade inválida!")
    } else if (idade >= 65) {
        println("idoso")
    } else if (idade >= 40) {
        println("meia idade")
    } else if (idade >= 22) {
        println("adulto")
    } else if (idade >= 14) {
        println("adolescente")
    }

}