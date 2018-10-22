fun minhaPrimeiraFuncao(nome: String = "Visitante", idade: Int = 15)
{
    print(nome)
    print(". Tenho "+ idade + " anos")
}

fun main(args: Array <String>)
{
    val listName = listOf("Earlie Shiflett",
            "Margit Severino  ",
            "Liana Sperling  ",
            "Deandra Chaput  ",
            "Princess Rinehart  ",
            "Christi Naylor  ",
            "Petra Funston  ",
            "Xiao Thomasson  ",
            "Aron Dewoody  ",
            "Emory Alloway  ",
            "Rochelle Krone  ",
            "Earline Soucie  ",
            "Kassie Wadman  ",
            "Rosette Schaner  ",
            "Rachel Gabriele  ",
            "Roseline Puglisi  ",
            "Benita Cude  ",
            "Daren Hanscom  ",
            "Sonny Borror  ",
            "Cleveland Bohr  ")
    println("index: ${listName.fold(ArrayList<Char>()) { acc, s -> containsElement(acc, s) }}")
    print("Eae ")
    minhaPrimeiraFuncao()
}
