//Polymorphism.


fun show(name:String):Unit
{
    println("Name $name")
}
fun show(Number:Int):Unit
{
    println("Name $Number")
}
fun show(numberD:Double):Unit
{
    println("Name $numberD")
}
fun main()
{
    show("Sandeep")
    show(10.5)
    show(100)
}