fun main() {
    val input = readln()
    var container = mutableListOf<Any>()
    for (each in input) {
        container.add(each)
    }
    println(container[0])
}
