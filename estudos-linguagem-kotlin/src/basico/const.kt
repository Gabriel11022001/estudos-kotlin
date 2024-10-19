package basico

/**
 * em kotlin eu posso criar variáveis ou constantes
 * fora do escopo das funções, direto no corpo do arquivo,
 * e consigo acessar elas normalmente no escopo das funções,
 * se eu utilizo o const nesse caso, o kotlin não precisa buscar
 * o valor na memória, o que é muito bom a nivel de performace
 */
const val nome: String = "Gabriel"
const val idade: Int = 23
const val telefone: String = "(14) 99877-8754"

fun main() {
    println(nome.uppercase())
    println(idade)
    println(telefone)
}