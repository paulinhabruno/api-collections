package one.digitalinnovation.collection


class Repositorio<T> {
    private val map = mutableMapOf<String, T>()

    fun create(id: String, value: T){
        map[id] = value
    }
    fun findById(id: String) = map[id]
}


