fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    list.remove(3) 
    println(list) // Output: [1, 2, 4, 5]

    val set = mutableSetOf<Int>(1, 2, 3, 4, 5)
    set.remove(3)
    println(set) //Output: [1, 2, 4, 5]

    val map = mutableMapOf<String, Int>("one" to 1, "two" to 2, "three" to 3, "four" to 4, "five" to 5)
    map.remove("three")
    println(map) //Output: {one=1, two=2, four=4, five=5}
}