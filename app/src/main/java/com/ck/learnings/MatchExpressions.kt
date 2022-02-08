package com.ck.learnings

import java.lang.Exception

fun main(){
    val inputHelper = InputHelper()
    val mathExpressionHelper = MathExpressionHelper()
    val outputHelper = OutputHelper()

    while (true){
        outputHelper.printMenu()
        try {
            val menuChoice = inputHelper.getIntValue("Enter the value : ")
            when (menuChoice) {
                1 -> {
                    val radius = inputHelper.getFloatValue("Enter the radius : ")
                    val answer = mathExpressionHelper.findAreaOfCircle(radius)
                    outputHelper.printString("The Area of half circle is : $answer")
                    println("")
                }
                2 -> {
                    val radius = inputHelper.getFloatValue("Enter the radius : ")
                    val answer = mathExpressionHelper.findAreaOfHalfCircle(radius)
                    outputHelper.printString("The Area of square is : $answer")
                    println("")
                }
                3 -> {
                    val side = inputHelper.getFloatValue("Enter the side value : ")
                    val answer = mathExpressionHelper.findAreaOfSquare(side)
                    outputHelper.printString("The Area of half circle is : $answer")
                    println("")
                }
                4 -> {
                    outputHelper.printString("Thanks for using our application")
                    break
                }
            }
        }catch (numberFormatException : Exception){
            println("")
            outputHelper.printString("Invalid input, please try again!")
        }
    }


}
