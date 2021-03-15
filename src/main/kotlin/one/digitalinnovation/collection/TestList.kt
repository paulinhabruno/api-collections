package one.digitalinnovation.collection

fun main() {

    val joao = Funcionario(nome = "João", salario = 2000.0, "CLT")
    val pedro = Funcionario(nome = "Pedro", salario = 1500.0, "PJ")
    val maria = Funcionario(nome = "Maria", salario = 4000.0, "CLT")

    val funcionarios = listOf(joao, pedro, maria)

    funcionarios.forEach { println(it) }
    println("--imprime a lista certinha de funcionário e seu salário. Se quiser imprimir somente 1, faça ---")

    println(funcionarios.find { it.nome =="Maria" })

    println("-- encadeamento de operações sobre uma colection. Neste caso vai imprimir os funcionários tendo os salarios em ordem e não pela letra  ---")

    funcionarios.sortedBy { it.salario }.forEach { println(it) }

    println("-- Cria uma lista pelo tipo de contratacao ---")

    funcionarios.groupBy { it.tipoContratacao }.forEach { println(it) }

}


