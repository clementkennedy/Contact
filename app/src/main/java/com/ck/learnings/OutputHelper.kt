package com.ck.learnings

class OutputHelper {

    /**
     * Prints the value to user
     * @param value
     */
    fun printString(value: String) {
        println(value)
    }

    fun printMenu(){
        println("---------------------------------------------------------------------")
        println("                   Math Expression Calculator")
        println("---------------------------------------------------------------------")
        println("   1. Find area of circle")
        println("   2. Find area of half circle")
        println("   3. Find area of square")
        println("   4. Exit")
        println("---------------------------------------------------------------------")
        println("")
    }
}