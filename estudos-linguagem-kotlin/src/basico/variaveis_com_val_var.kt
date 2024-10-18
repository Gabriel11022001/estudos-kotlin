package basico

fun main() {
    // em kotlin, para cria variável utilizamos var
    var nome: String = "Gabriel"
    var sobrenome: String = "Rodrigues"
    var nomeCompleto: String = nome + " " + sobrenome
    println("Nome completo: $nomeCompleto")

    var idade: Int = 23
    println("Idade: $idade")

    /**
     * a variável abaixo vai ser do tipo String por
     * definição explicita de tipo
     */
    var genero = "Masculino"

    /**
     * quando utilizo o var, posso reatribuir o valor da varivel
     */
    var contador = 10
    println(contador)

    contador = contador + 22
    println(contador)

    // val -> constante, não posso reatribuir o valor da variável
    val contador2: Int = 10
    // contador2 = 12
    println(contador2)
}
