

//App find my age.
import java.util.*
fun main()
{
    //input2058
    println("Enter your date of birth =")
    var DOB:Int=readLine()!!.toInt()
    //process
    var year=Calendar.getInstance().get(Calendar.YEAR)
    var age:Int=year-DOB
    //output
    println("Your age is $age.")
}