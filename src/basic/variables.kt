package basic

fun main(args: Array<String>)
{
    var name = "Italo Bruno"
    var age : Int

    //val é equivalente ao final no java. Não pode ser mudada após uma vez atribuída um valor a ela.
    //Você pode aproveitar a declaração da variavel para atribuir um valor ficando
    val lastName = "Silva" //Desta maneira também não é preciso declarar o tipo da variável

    //Outro ponto muito importante das variáveis em kotlin é o lateinit
    //Com o lateinit voce pode declarar uma varaviel e dizer que ira inicializa-la mais tarde
    //E caso esqueça de inicializar um erro será lançado
    lateinit var teste: String

    teste = "Teste"

    //Também temos aqui o lazy
    //que é uma forma de criar uma variável que será instanciada apenas quando o seu uso
    //for necessário desse jeito ganhamos performance
    val teste1 by lazy {
        "chiclete"
    }
}
