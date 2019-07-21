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
        copying()
        someFunctions()
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
        val emptySet = mutableSetOf<String>()
        println(emptySet)
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
    fun copying(){
        val sourceList = mutableListOf(1, 2, 3)
        val copyList = sourceList.toMutableList()
        val readOnlyCopyList = sourceList.toList()
        sourceList.add(4)
        println("Copy size: ${copyList.size}")

        //readOnlyCopyList.add(4)             // compilation error
        println("Read-only copy size: ${readOnlyCopyList.size}")
        val copySet = sourceList.toMutableSet()
        copySet.add(3)
        copySet.add(4)
        println(copySet)

        val referenceList = sourceList
        referenceList.add(4)
        println("Source size: ${sourceList.size}")

        val referenceList1: List<Int> = sourceList
        //referenceList.add(4)            //compilation error
        sourceList.add(4)
        println(referenceList1) // shows the current state of sourceList
    }
    fun someFunctions(){
        val numbers = listOf("one", "two", "three", "four")
        val longerThan3 = numbers.filter { it.length > 3 }
        println(longerThan3)

        val numbers1 = setOf(1, 2, 3)
        println(numbers1.map { it * 3 })
        println(numbers1.mapIndexed { idx, value -> value * idx })

        val words = listOf("a", "abc", "ab", "def", "abcd")
        val withLength = words.associateBy { it.length }
        println(withLength.keys) // [a, abc, ab, def, abcd]
        println(withLength.values) // [1, 3, 2, 3, 4]
    }
}