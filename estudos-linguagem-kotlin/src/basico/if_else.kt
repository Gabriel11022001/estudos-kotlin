package basico

fun main() {
    var tempetura = 26

    if (tempetura > 25) {

        if (tempetura >= 30) {
            println("está um calor de matar")
        } else {
            println("está calor")
        }

    } else {

        if (tempetura >= 15) {
            println("está ameno")
        } else {
            println("está frio")
        }

    }

    println("informe um valor:")
    var valorInformado = readLine()!!.toInt()

    if (valorInformado > 10) {
        valorInformado = 10
    }

    println("calculo: ${ valorInformado * valorInformado }")

    // validar se número é par ou impar
    println("informe um valor para ser calculado se ele é par ou impar:")
    val valorParImpar = readLine()!!.toInt()

    if (valorParImpar % 2 == 0) {
        println("o número $valorParImpar é par!")
    } else {
        println("o número $valorParImpar é impar!")
    }

}