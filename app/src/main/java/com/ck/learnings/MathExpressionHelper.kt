package com.ck.learnings

import java.lang.NumberFormatException

/*
    MathExpressionHelper provides helper methods.
 */
class MathExpressionHelper {

    /**
     * This method finds the area of the circle.
     * @param radius
     * @return Area of the circle.
     */
    fun findAreaOfCircle(radius: Float): Float {
        /*if (radius <= 0)
            throw NumberFormatException("Number must be greater than 0")
*/
        return radius * radius * 3.14f

    }

    /**
     * This method finds the area of half circle.
     * @param radius
     * @return Returning the area of half circle
     */
    fun findAreaOfHalfCircle(radius: Float): Float {
        return findAreaOfCircle(radius)/(2f)
    }

    /**
     * Find the area of square
     * @param side
     * @return Returns the area of square
     */
    fun findAreaOfSquare(side:Float): Float{
        if (side <= 0)
            throw NumberFormatException("Number must be greater than 0")

        return side * side
    }

}

