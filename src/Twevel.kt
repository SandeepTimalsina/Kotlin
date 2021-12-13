//Debugging.
//break point.


import java.util.*
fun main()
{
    //input
    println("Enter your date of birth =")
    var DOB:Int=readLine()!!.toInt()
    //process
    var year=Calendar.getInstance().get(Calendar.YEAR)
    var age:Int=year-DOB
    //output
    println("Your age is $age.")
}