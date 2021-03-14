package one.digitalinnovation.collection

fun main() {
    val nomes = Array(3) {""}
    nomes[0] = "Maria"
    nomes[1] = "Paula"
    nomes[2] = "Marcos"

    for (nome in nomes){
        println(nome)
    }

    println("-----Outra forma de array de nomes ordenado usando sort e it----")

    nomes.sort()
    nomes.forEach { println(it) }

    println("-----Outra forma de array de nomes sem colocar em linhas, mas em colunas + sort (ordenamento) + it (enxergando que é um nome) ----")

    val nomes2 = arrayOf("Maria", "Paula", "Marcos")
    nomes2.sort()
    nomes2.forEach { println(it) }

}