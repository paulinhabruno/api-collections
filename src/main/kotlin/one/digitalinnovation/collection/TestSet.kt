package one.digitalinnovation.collection

fun main() {
    val joao = Funcionario( "João",  2000.0, "CLT")
    val pedro = Funcionario( "Pedro",  1500.0, "PJ")
    val maria = Funcionario( "Maria", 4000.0, "CLT")

    val funcionarios1 = setOf(joao, pedro)
    val funcionario2 = setOf(maria)

    println("--Depois de separar os funcionários em grupos, vai unir todos, o 1 e o 2--")

    val resultUnion = funcionarios1.union(funcionario2)
    resultUnion.forEach{ println(it)}

    println("--Outra operação: vai subtrair do conj 3 quem está no 2--")

    val funcionarios3 = setOf(joao, pedro, maria)
    val resultSubtract = funcionarios3.subtract(funcionario2)
    resultSubtract.forEach{ println(it)}


    println("--Outra operação: interseção entre os conjuntos ou seja, o funcionário em comum--")

        val resultIntersect = funcionarios3.intersect(funcionario2)
    resultIntersect.forEach{ println(it)}

}