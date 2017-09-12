package basic

fun main(args: Array<String>)
{
    val name = "Gabriel" +
            "  Ferrari" +
            ". Estou gostando de strings."

    val name2 = """ |Meu nome é
                    |Gabriel
                    |. Teste
                    |Estou gostando de Strings""".trimMargin()
    //trimMargin tira todas os tabs que tem nesse trecho de string que começa com |

    //println(name)
    //println(name2)

    val name3 = "Gabriela"

    //Uma outra forma de concatenar strings
    println("Olá, $name3")
    //Uma forma de concatenar um trecho de código dentro de uma string ${trecho de código}
    println("Olá, ${name3.length}")

    println("Olá, ${name3[0]}")

}