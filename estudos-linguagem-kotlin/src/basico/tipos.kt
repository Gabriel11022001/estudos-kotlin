package basico

import kotlin.reflect.typeOf

fun main() {
    // inteiro
    val idade = 22
    val idade2: Int = 21

    // double
    val salario: Double = 3500.0

    // float
    val percentualAumento: Float = 22.9f

    // string
    val nome: String = "Gabriel"

    // boolean
    val possuiCnh: Boolean = true

    println(idade)
    println(idade2)
    println(salario)
    println(nome)
    println(possuiCnh)

    // array
    val clientes = arrayOf("Gabriel", "Pedro", "Maria", "Eduarda", "Fernando")

    clientes.forEach { clienteNome ->
        println(clienteNome)
    }

    // concatenar strings
    val primeiroNome = "Gabriel"
    val sobrenome = "Rodrigues"
    val nomeCompleto = primeiroNome + " " + sobrenome
    println("nome completo: " + nomeCompleto)

    // também posso concatenar da seguinte forma
    val endereco = "Rua Brasil"
    val bairro = "Bairro das flores"
    val numero = "123"
    val cidade = "Bastos"
    val estado = "SP"
    val enderecoCompleto = "$endereco, $bairro, $numero, $cidade - $estado"
    println(enderecoCompleto)
}