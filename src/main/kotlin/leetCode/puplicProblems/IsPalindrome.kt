package leetCode.puplicProblems

fun isPalindrome(x: Int): Boolean {
    return x.toString().reversed() == x.toString()
}

fun main() {
    println(isPalindrome(123))
}
