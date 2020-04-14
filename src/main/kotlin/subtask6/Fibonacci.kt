package subtask6

class Fibonacci {

    // TODO: Complete the following function
    fun productFibonacciSequenceFor(n: Int): IntArray {
        var l = 0
        var step = 1
        while (l * step < n) {
            val tmp = step
            step += l
            l = tmp
        }
        return intArrayOf(l, step, if (l * step == n) 1 else 0)
    }
}
