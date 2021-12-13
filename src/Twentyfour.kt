//Return and Jumps.
//continue and break.


fun main()
{
    for(count in 1..10)
    {
        if(count==4)
        {
            break//stops on four.
        }
        print("$count\t")
    }
    print("\n")
    for(count in 1..10)
    {
        if(count==4)
        {
            continue//skips 4 and runs others.
        }
        print("$count\t")
    }
    print("\n")
    for(count in 1..10)//give label like @loop
    {
        for(count in 1..10)
        {
            if(count==4)
            {
                break//only internal loop breaks.
                //now write the break@loop then whole loop breaks.
            }
        }

        print("$count\t")
    }
}