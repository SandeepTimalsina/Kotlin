//IF Else Statements


fun main()
{
    print("Enter your grade =")
    val grade=readLine()!!.toInt()
    if(grade<=40)
        println("You failed.")
    else
        println("You passed.")

}