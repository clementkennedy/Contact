package com.ck.learnings

import java.lang.Exception
import java.util.*

class ApplicationStart {
    fun valueOfHalfCircle() {

            var inputScanner = Scanner(System.`in`)
            println("Give me the radius value")
try{
            var radius = inputScanner.nextFloat()

            if (radius > 0) {
                val area = 3.14 * radius * radius
                val halfArea = area / 2
                println("The area of the half circle is $halfArea")
            } else {

                println(" $radius is not the valid inputs")
                println("Enter the valid input")
                valueOfHalfCircle()
            }
        } catch (e: Exception) {
               println("that is not a valid input")
               println("Enter the valid input")
               valueOfHalfCircle()
}
            }
        }
/*
    This is the starting of the program.
 */
fun main() {

    val ans = ApplicationStart()
    ans.valueOfHalfCircle()

}


