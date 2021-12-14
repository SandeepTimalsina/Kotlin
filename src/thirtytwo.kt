//functions in Kotlin

fun sum(n1:Int, n2:Int):Int//user defined function.
{
    //block of code
    var sum=n1+n2
    return sum
}

fun main()
{
    var r=sum(10,12)
    println("-----output------")
    println("$r")
    var sum1=sum(11,44)
    println("----output-------")
    println("$sum1")
}