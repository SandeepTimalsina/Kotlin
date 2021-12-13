//If elseif or ELseIF.


fun main()
{
    print("Enter your grade =")
    var grade= readLine()!!.toInt()
    println("----output-----")
    if(grade<40)
        println("Failed")
    else if(grade>=50 && grade<60)
        println("Third Division")
    else if(grade>=60 && grade<70)
        println("Second Division")
    else if(grade>=70 && grade<80)
        println("First Division")
    else if(grade>=80 && grade<90)
        println("Distinction")
}