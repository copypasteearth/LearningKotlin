/**
author: copypasteearth
date: 7/20/2019
project: LearningKotlin
 */
class CustomObject(val name:String,var age: Int){

    override fun toString(): String {
        return "$name: $age"
    }

}