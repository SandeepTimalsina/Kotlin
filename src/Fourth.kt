//Input date in a variable,string and Double.

fun main()
{
    print("Enter your name")
    var name:String= readLine()!!.toString()
    println("Your name is :"+ name)
    print("Enter your age:")
    var age:Int=readLine()!!.toInt()
    println("Your age is :"+ age)
    print("Enter pi")
    var pi:Double=readLine()!!.toDouble()
    println("Value of pi :"+ pi)
}