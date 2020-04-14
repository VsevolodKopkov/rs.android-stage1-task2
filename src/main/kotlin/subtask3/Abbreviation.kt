package subtask3

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String =
        if (a.contains(b, true) ||
            a.filter {
                b.contains(it, true)
            }.equals(b, true)
        )
            "YES"
        else
            "NO"
}
