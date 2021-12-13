//Increment and decrement.
//priorities order
/*
1.()
2.++,-- (before var)
3.^
4.*,/
5.+,-
6.==
 */

fun main()
{
    var x=10
    var y=11
    var z=--x+y  //(++x)=(x=x+1)
    println(z)
    var x1=4
    var x2=3
    var x3=7
    var x4=x1+x2+x3
     x4+=3
    print(x4)
}