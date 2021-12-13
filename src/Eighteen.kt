//When Statement.


fun main() {
    print("Enter your grade =")
    var x = readLine()!!.toInt()
    when (x) {
        1 -> {
            print("Value is 1")
        }
        in 2..50 -> {
            print("between 2 to 50")
        }
        else -> {
            print("Value is unknown")
        }
    }
}