fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.removeIf { it > 2 }
    println(list) // Output: [1, 2]

    val set = mutableSetOf(1, 2, 3, 4, 5)
    val iterator = set.iterator()
    while (iterator.hasNext()){
        if(iterator.next() > 2) iterator.remove()
    }
    println(set) // Output: [1, 2]

    val map = mutableMapOf(1 to "one", 2 to "two", 3 to "three", 4 to "four", 5 to "five")
    val keysToRemove = map.filter { it.key > 2 }.keys
    keysToRemove.forEach { map.remove(it) }
    println(map) // Output: {1=one, 2=two}
} 