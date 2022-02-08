package com.ck.learnings

fun main(){
    val  listobj = PractiseForLoop()
    listobj.intArray()
}
class PractiseForLoop {

    fun intArray(){

        val list = intArrayOf(2,3,4,5,6,12,13,14,45)

        for (i in 0 until 10){
            println(i)
        }
    }
}