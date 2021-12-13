//input values in 1D array


fun main(args:Array<String>)
{
    var arr=Array<String>(5){""}
    for(i in 0..4)
    {
        println("----input value-----")
        arr[i]=readLine()!!//get value in array.
    }
    for( i in 0..4)
    {
        print("Value="+ arr[i])//print all value in array.
    }
}