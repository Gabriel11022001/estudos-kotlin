package basico

import java.util.Scanner

fun main() {
    println("Digite seu nome:")
    val nome = readln()

    println("Digite seu telefone:")
    val telefone = readln()

    println("Digite sua idade:")
    val idade = readln()

    if (idade.toInt() <= 0) {
        println("Idade inválida!")
    } else {
        println(nome)
        println(telefone)
        println(idade)
    }

    // também posso ler dados do teclado por meio da classe Scanner
    val scanner = Scanner(System.`in`)
    println("Informe seu nome:")
    val nomeLidoScanner: String = scanner.nextLine()

    println("Informe seu peso:")
    val peso: Double = scanner.nextDouble()

    println("o nome digitado é: $nomeLidoScanner")
    println("seu peso é: $peso")
}