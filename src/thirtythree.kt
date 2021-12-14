//Function Overload


fun sum1(n1:Int,n2:Int):Int
{
   return n1+n2
}
fun sum1(n1:Int,n2:Int,n3:Int):Int
{
    return n1+n2+n3
}
fun main()
{
   var sum=sum1(2,3,4,)
    println("------output------")
    println("Sum of  three number is $sum")
}