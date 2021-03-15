package one.digitalinnovation.collection

fun main() {

    println("-- Criando map / Pair = par, pares ---")

    val pair: Pair<String, Double> = Pair("Joao", 1000.0)
    val map1= mapOf(pair)

    println("-- Aqui k e v são os elementos do pair, ou seja, o nome do funcionário e o salário  ---")

    map1.forEach { (k, v) -> println("Chave: $k - Valor: $v")}

    println("-- no map 2 usou a o to (sintaxe infix) ---")

    val map2 = mapOf(
        "Pedro" to 2500.0,
        "Maria" to 3000.0
)
    map2.forEach { (k, v) -> println("Chave: $k - Valor: $v")}
}