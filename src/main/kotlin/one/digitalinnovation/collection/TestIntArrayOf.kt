package one.digitalinnovation.collection

fun main() {
    val values = intArrayOf(2, 3, 4, 1, 10, 7)

    values.forEach {
        println(it)
    }

    println("--Outra forma de criar um array sem precisar criar a capacidade na instanciação, imprimindo ordenado usando o sort---")

    values.sort()
    values.forEach {
        println(it)
    }
}
