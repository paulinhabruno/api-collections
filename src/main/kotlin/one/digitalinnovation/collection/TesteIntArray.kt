package one.digitalinnovation.collection

fun main() {
    val values = IntArray(5)

    /**todo array começa em zero */

    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2

    for (valor in values) {
        println(valor)
    }

    println("----------Outra forma de iteração--------------")

    values.forEach {
        println(it)
    }

    println("---------Ou então---------------")

    values.forEach { valor ->
        println(valor)
    }

    println("-------Ou então-----------------")

    for (index in values.indices){
        println(values[index])
    }

    println("----------ORDENAR: COLOCAR OS NÚMEROS EM ORDEM CRESCENTE--------------")

    values.sort()
    for (valor in values){
        println(valor)
    }
}