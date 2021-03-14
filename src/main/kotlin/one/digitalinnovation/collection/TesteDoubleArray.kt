package one.digitalinnovation.collection

fun main() {

    val salarios = DoubleArray(3)
    salarios[0] = 1000.0
    salarios[1] = 3000.0
    salarios[2] = 500.0

    salarios.forEach { println(it) }


    println("--Outra forma de iterar um doublearray dando aumento, por exemplo a uma dada posição ---")

    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.1
    }

    salarios.forEach { println(it) }

    println("--Outra forma de iterar um doublearray colocando ordenado ---")

    val salarios2 = doubleArrayOf(1500.0, 12500.0, 5000.0)
    salarios2.sort()
    salarios2.forEach { println(it) }
}