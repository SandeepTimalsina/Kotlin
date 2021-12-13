//string


fun main()
{
    var a:String="SandeepT"
    println(a)
    println("$a")
    println(""+ a.lowercase())//all string to lower case.
    var name="Sandeep"+"Timalsina"//joining string
    println(name)
    //printing the second character in string
    println("second char:"+ a[1])//prints a in "SandeepT".
    println("spliting:"+ name.split("i"))//splits where there is i.
    println("triming"+ name.trim())//removes space after and before.
}