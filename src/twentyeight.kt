//Arraylist.


fun main()
{
    var arr=ArrayList<Int>()
    arr.add(5)
    arr.add(4)
    arr.set(0,10)//arr[0] location was 5 which changed to 10
    println(""+ arr[0])
    println("All elements")
    for(i in arr)
        println(i)

//search
    if(arr.contains(4))//search the contains
    {
        println("found")
    }
    else
        println("404 not found")
    //print by i
    for(i in 0..arr.size-1)
    {
        println(arr[i])
    }
}