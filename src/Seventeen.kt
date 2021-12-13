//nested IF


fun main()
{
    print("Enter your grade =")
    var grade=readLine()!!.toInt()
    if(grade>=90)
    {
        if(grade==100)
            println("You scored 100%")
        else
            println("Its Distinction")
    }
}