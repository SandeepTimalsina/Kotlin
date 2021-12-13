//Kotlin collects.


fun main()
{
    var map=hashMapOf(1 to "sandeep",2 to "Tim")
    map.put(3,"lava")
    println(map.get(3))
    println(map[3])
    var arr=arrayOf(1,2,3,4,5)
    println(arr[0])
    var list=mutableListOf(11,22,33,44)//list is immutable.
    list[0]=10//change in list[0] because we give mutable there.
    for(i in list)
        println(i)

}