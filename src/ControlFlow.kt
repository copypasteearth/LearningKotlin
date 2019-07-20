import java.lang.Integer.parseInt

/**
author: copypasteearth
date: 7/20/2019
project: LearningKotlin
 */
object ControlFlow{
    /**
     * main function just like java the entry point to the application.
     */
    @JvmStatic fun main(args: Array<String>){
        println(Constants.COPYPASTEEARTH)
        forLoops()
        ifStatements(5,10)
        ifStatements(10,5)
        whenControlStatements(10)
        whileLoops()
        println(hasPrefix("prefixsss"))
    }

    /**
     * method for loops demonstrates the different types of for loops that kotlin uses
     */
    fun forLoops(){
        var listA = listOf<String>("Example", "Program", "Tutorial")
        var CusObj = listOf<Int>(1,2,3,4,5,6,7,8,9,0)
        for (item in listA) println(item)
        for (item: Int in CusObj) {
           println(item)
        }
        for (i in CusObj.indices) {
            println(CusObj[i])
        }
        for ((index, value) in CusObj.withIndex()) {
            println("the element at $index is $value")
        }
        for (i in 1..3) {
            println(i)
        }
        for (i in 6 downTo 0 step 2) {
            println(i)
        }
    }

    /**
     * method for demonstrating if statements
     */
    fun ifStatements(a: Int,b:Int){
        // Traditional usage
        var max1 = a
        if (a < b) max1 = b
        println("value of max1 is $max1")
        // With else
        var max2: Int
        if (a > b) {
            max2 = a
        } else {
            max2 = b
        }
        println("value of max2 is $max2")
        // As expression
        val max3 = if (a > b) a else b
        println("value of max3 is $max3")


        //can be blocks, last expression is the value
        val max4 = if (a > b) {
            println("Choose a")
            a
        } else {
            println("Choose b")
            b
        }
        println("value of max4 is $max4")
    }

    /**
     * method for demonstrating when statements
     */
    fun whenControlStatements(x:Int){
        when (x) {
            1 -> println("x == 1")
            2 -> println("x == 2")
            else -> { // Note the block
                println("x is neither 1 nor 2")
            }
        }

        when (x) {
            0, 1 -> println("x == 0 or x == 1")
            else -> println("otherwise")
        }
        val s = "10"
        when (x) {
            parseInt(s) -> println("s encodes x")
            else -> println("s does not encode x")
        }
        val validNumbers = listOf<Int>(20,21,22,23,24,25)
        when (x) {
            in 1..10 -> println("x is in the range")
            in validNumbers -> println("x is valid")
            !in 10..20 -> println("x is outside the range")
            else -> println("none of the above")
        }

        when {
            x.equals(x) -> println("x is odd")
            x.equals(s) -> println("x is even")
            else -> println("x is funny")
        }
    }
    fun hasPrefix(x: Any) = when(x) {
        is String -> x.startsWith("prefix")
        else -> false
    }
    fun whileLoops(){
        var x = 10
        while (x > 0) {
            x--
        }

        do {
            val y = null
        } while (y != null) // y is visible here!
    }

}