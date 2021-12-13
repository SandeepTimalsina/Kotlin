//One dimension array(1 D array)


fun main()
{
    var arr= Array<Int>(5){0}
    arr[3]=55
    println("Array[3]:"+ arr[3])
    println("All element")
    for(i in 0..4)
    {
        println(arr[i])
    }
}
