package basico

fun main() {
    /**
     * no kotlin, não existe um operador ternário, para esse caso,
     * é necessário utilizar o if else retornando valor, que pode servir
     * como operador ternário, mas ele é melhor pois eu posso fazer vários testes
     * lógicos
     * -> é obrigatório sempre ter um if e um else, eu não posso simplesmente
     * utilizar o if, e também é correto sempre retornar o mesmo tipo de dado
     */
    val idade = 12
    val maiorIdade = if (idade >= 18) {
        true
    } else {
        false
    }

    println("maior de idade? ${ if (maiorIdade) { "Sim" } else { "Não" } }")

    val mesAtual = 11

    val mensagem = if (mesAtual == 1) {
        "Está em janeiro"
    } else if (mesAtual == 2) {
        "Está em fevereiro"
    } else if (mesAtual == 3) {
        "Está em março"
    } else {
        "Não está nem em janeiro, nem em fevereiro e nem em março!"
    }

    println(mensagem.uppercase())
}