package basico

fun main() {
    val nomeCompleto = "Gabriel Rodrigues dos Santos"

    // && -> e
    if (nomeCompleto.isNotBlank() && nomeCompleto.length > 3) {
        println("O nome completo foi informado corretamente!")
    } else {
        println("Informe o nome completo!")
    }

    val idade = 15
    val estaAcompanhado = true

    // || -> ou
    if (idade >= 18 || (estaAcompanhado && idade >= 15)) {
        println("Pode entrar na festa!")
    } else {
        println("Não pode entrar na festa!")
    }

    // operador de negação -> nega o valor, ou seja, se for false vira true, e vice e versa
    println(!estaAcompanhado)
}