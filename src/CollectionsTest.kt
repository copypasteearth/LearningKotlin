/**
author: copypasteearth
date: 7/20/2019
project: LearningKotlin
 */
object CollectionsTest {
    /**
     * main function just like java the entry point to the application.
     */
    @JvmStatic fun main(args: Array<String>){
        println(Constants.COPYPASTEEARTH)
        mutableList()
        set()
        map()
    }
    fun mutableList(){
        val numbers = mutableListOf(1, 2, 3, 4)
        numbers.add(5)
        numbers.removeAt(1)
        numbers[0] = 0
        numbers.shuffle()
        println(numbers)
    }
    fun set(){
        val numbers = setOf(1, 2, 3, 4)
        println("Number of elements: ${numbers.size}")
        if (numbers.contains(1)) println("1 is in the set")

        val numbersBackwards = setOf(4, 3, 2, 1)
        println("The sets are equal: ${numbers == numbersBackwards}")

        val muteSet = mutableSetOf(1,2,3,4,5)
        muteSet.add(0)
        muteSet.add(6)
        println(muteSet)
        val muteSetBackwards = mutableSetOf(5,4,3,2,1)
        muteSetBackwards.add(0)
        muteSetBackwards.add(6)
        println(muteSetBackwards)
        println("the sets are equal: ${muteSet == muteSetBackwards}")
    }
    fun map(){
        val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 1)

        println("All keys: ${numbersMap.keys}")
        println("All values: ${numbersMap.values}")
        if ("key2" in numbersMap) println("Value by key \"key2\": ${numbersMap["key2"]}")
        if (1 in numbersMap.values) println("The value 1 is in the map")
        if (numbersMap.containsValue(1)) println("The value 1 is in the map") // same as previous

        val numbersMap1 = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 1)
        val anotherMap = mapOf("key2" to 2, "key1" to 1, "key4" to 1, "key3" to 3)
        println(numbersMap1)
        println(anotherMap)
        println("The maps are equal: ${numbersMap1 == anotherMap}")

        val numbersMap3 = mutableMapOf("one" to 1, "two" to 2)
        numbersMap3.put("three", 3)
        numbersMap3["one"] = 11

        println(numbersMap3)
    }
}