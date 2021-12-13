// Simple IF


fun main()
{
    println("Enter your grade =")
    var grade=readLine()!!.toInt()
    if (grade>40)
        println("$grade is Pass")
    else
        println("$grade is Fail")

}