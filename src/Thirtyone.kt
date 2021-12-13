//Set Of and mutableSetOf.


fun main()
{
    var set=setOf(1,2,3,4,5)//it is immutable
    for(element in set)
        println(element)
    //for mutable
    var set1= mutableSetOf(1,3,5,7,9)
    for(i in set1)
        println(i)
}