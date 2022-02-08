package basics.sort

fun main(){

val helper = SwapNumbers()
    //helper.swapNum()
    helper.bubbleSort()
}
class SwapNumbers {
/*
* we are interchanging the numbers(swapping)
 */
    fun swapNum() {
        var a = 4
        var b = 7
    var temp = a
       a = b
   // b = a if we write like this it will show the value of b
    b = temp
    println("a =  $a" )
    println("b =  $b" )

}
 fun bubbleSort(){

     var a :IntArray = intArrayOf(20,11,45,34,23,13,16)
     println(a.count())
     println("Array before shorting ")
     for (i in a){
         print(" "+i)
     }
     for (i in 0..6){
         for (j in 1..(6-i)){
             if(a[j-1] > a[j]){
                 var temp = a[j-1]
                 a[j-1] = a[j]
                 a[j] = temp
             }

         }
     }
     println()

     println("Array after sorting ; ")
     for (i in a){
         print(" "+i)
     }
 }
}