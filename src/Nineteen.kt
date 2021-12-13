//Expression IF and When.


fun main()
{
    val x=10
    val y=20
    var z= if(x<y) x else y
    println("Value of z is $z")
    //when
    print("Enter your age =")
    var age=readLine()!!.toInt()
    var isyoung=when(age)
    {
        in 1..30->true
        else->false
    }
    println("I am young is $isyoung")

}