fun main() {

    val string = "man has dog"
    print(reversString(string))
    
}

fun reversString(string: String): String =
    string.split(" ").reversed().joinToString(" ")