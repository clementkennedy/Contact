package com.ck.learnings

fun main(){
    val ascending = BubbleSort()
    ascending.ascendingOder()

}

class BubbleSort {

    fun ascendingOder() {
        val list = intArrayOf(6, 4, 10, 3, 7)

        println("Array before sorting")
        println(list.size)
        for (i in list) {
            print(" " + i)
        }
        println()
        val list1 = intArrayOf(6, 4, 10, 3, 7)
        for (i in 0 until list.size-1) {// 4  //0,1,2,3,4
                println("Loop 1 the i value $i")
            for (j in 1 until list.size - i) { // here last iteration 1 to 4 -4
                if (list[j - 1] > list[j]) { // list[0] > list[1]
                    var temp = list[j - 1] // temp = 6
                    list[j - 1] = list[j] // list[0] = 4 //list[1] = 4
                    list[j] = temp // list[1]= 6
                    }
                for (k in list){
                    print(" $k")

                }
                println()

            }
        }
        println()

        println("Array after sorting")
        for (i in list) {
            print(" " + i)
        }


    }


    }
