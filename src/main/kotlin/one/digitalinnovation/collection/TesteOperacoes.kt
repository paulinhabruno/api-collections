package one.digitalinnovation.collection

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    for (salario in salarios){
        println(salario)
    }

    println("--imprime maior salario ( com o $ { . max () } ou menor salario com o $ { . min () e a média com avarega} ---")

    println("Maior salario: ${salarios.maxOrNull()}")
    println("Menor salario: ${salarios.minOrNull()}")
    println("Media salarial: ${(salarios.average())}")

    println("--imprime o item maior ---")

    val salariosMaiorQue2500 = salarios.filter {it > 2500.0}
    println("----------------")
        salariosMaiorQue2500.forEach { println(it) }

    println("--imprime o número de elementes que estão dentro da faixa de valores especificada (range) ---")

    println(salarios.count { it in 2000.0..5000.0 })

    println("-- imprime se há o número da conta. NO any imprime verdadeiro ou falso ---")

    println(salarios.find { it == 2250.0 })
    println(salarios.find { it == 500.0 })
    println(salarios.any { it == 1000.0 })
    println(salarios.any { it == 500.0 })
}