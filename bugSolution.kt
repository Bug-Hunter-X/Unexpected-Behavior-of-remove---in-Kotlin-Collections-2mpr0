fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    val removed = list.remove(3) //check the result of removal
    println("Removed from list: $removed")
    println(list) // Output: [1, 2, 4, 5]

    val set = mutableSetOf<Int>(1, 2, 3, 4, 5)
    val removedFromSet = set.remove(3)
    println("Removed from set: $removedFromSet")
    println(set) //Output: [1, 2, 4, 5]

    val map = mutableMapOf<String, Int>("one" to 1, "two" to 2, "three" to 3, "four" to 4, "five" to 5)
    val removedFromMap = map.remove("three")
    println("Removed from map: $removedFromMap")
    println(map) //Output: {one=1, two=2, four=4, five=5}
    //Consider using removeIf for more complex scenarios
    val numbers = mutableListOf(1, 2, 3, 4, 5, 6)
    numbers.removeIf { it % 2 == 0 } //removes all even numbers
    println(numbers) //[1, 3, 5] 
} 