fun inicio_main() {
    // val é uma variavel IMUTAVEL
    // var é uma variavel MUTAVEL

    println("Olá kotlin")
    Usuario().criarUsuario("Jean", 27)

    // ESPAÇOS DE MEMÓRIA EM TIPOS PRIMITIVOS

    // NUMEROS
    val byte: Byte = 8              // 8-bit
    val short: Short = 16           // 16-bit
    val age: Int = 31               // 32-bit (99% do tempo)
    val long: Long = 192L           // 64-bit
    val desconto: Float = 31.98f    // 32-bit
    val price: Double = 31.90       // 64-bit

    //TEXTO
    val nameNew: String = "Jean"

    // BOOLEANO (TRUE | FALSE)
    val booleano = true     // 8-bits/1-byte

    // CONVERSÃO DE TIPOS
    val mediaDePreco = 29

    val resposta = mediaDePreco.toDouble()

//    println(resposta)

    //PROPRIEDADES
    val name: String = "Jean Everton"
    val newNameUp = name.uppercase()
    val newNameQtd = name.length
    val newNameLow = name.lowercase()

//    println(newNameUp + "\n" + newNameQtd + "\n" +  newNameLow)

    //FORMATACAO DE TEXTO
    //1.
    val messege = "Olá Jean.\nSeu produto chegou!"

//    println(messege)

    //2.
    val welcome = """
        Olá Jean,
        Seu produto chegou!
        """.trimIndent()

    val welcome2 = """
        Olá Jean,
        Seu produto chegou!,
        Olá Jean,
        Seu produto chegou!
        """.replaceIndent(";")

    //3.
    val name3 = "Jean"
    val idade = 27
    val desc = 32.98

    // VANTAGEM DO KOTLIN
    println("Olá, $name3.\nSua idade é $idade anos. \nSeu desconto é: R$ $desc \ne seu nome tem ${name3.length} caracteres")

    //CONDIÇÕES

    val produto = "iP"

    // se, senão

    if (produto.length < 3) {
        println("O Produto tem somente ${produto.length} caracteres")
    } else {
        println("Seu produto chama: $produto")
    }

    // ACEITA null
    var endereco: String? = null


}