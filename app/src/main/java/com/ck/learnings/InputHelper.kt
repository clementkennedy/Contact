package com.ck.learnings

import java.lang.Exception
import java.util.*
import kotlin.jvm.Throws

class InputHelper {

    var inputScanner: Scanner = Scanner(System.`in`)
    var outputHelper = OutputHelper()

    /**
     * Get a float value from user and return the value
     * @param message
     * @return User Entered Value
     */
    fun getFloatValue(message: String): Float {
        outputHelper.printString(message)
        return inputScanner.nextFloat()
    }

    /**
     * Get a String value from user and return the value
     * @param User Message
     * @return User Entered Value
     */
    fun getStringValue(message: String): String {
        outputHelper.printString(message)
        return inputScanner.nextLine()
    }

    /**
     * Get a Integer value from user and return the value
     * @param User Message
     * @return User Entered Value
     */
    @Throws(Exception::class)
    fun getIntValue(message: String): Int {
        outputHelper.printString(message)
        return inputScanner.nextInt()
    }

}
