package basico

fun main() {
    val mesAtualNumero = 111
    var mesAtualNome = ""

    if (mesAtualNumero == 1) {
        mesAtualNome = "janeiro"
    }

    if (mesAtualNumero == 2) {
        mesAtualNome = "fevereiro"
    }

    if (mesAtualNumero == 3) {
        mesAtualNome = "março"
    }

    if (mesAtualNumero < 1 || mesAtualNumero > 3) {
        mesAtualNome = "nenhum dos meses testados"
    }

    println(mesAtualNome)
}