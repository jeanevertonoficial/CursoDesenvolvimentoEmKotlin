fun main() {
    olaMundo()

    Usuario().criarUsuario("Jean", 27)

    val resposta = somar(50, 45)

    println(resposta)

    val val1: Int = 50
    val val2: Int = 100

    val responseSoma = Calculadora().soma(val1, val2)
    val responseDivisao = Calculadora().divisao(val1, val2)
    val responseMultiplicacao = Calculadora().multiplicacao(val1, val2)
    val responseSubtracao = Calculadora().subtracao(val1, val2)

    println("A soma de $val1 + $val2 é: $responseSoma")
    println("A divisão de $val1 / $val2 é: $responseDivisao")
    println("A multiplicação de $val1 x $val2 é: $responseMultiplicacao")
    println("A Subtração de $val1 - $val2 é: $responseSubtracao")
}

fun olaMundo() {
    println("Olá mundo!")
}

fun somar(val1: Int, val2: Int ): Int {
    return val1 + val2
}

