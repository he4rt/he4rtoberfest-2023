fun main() = println(isPalindrome(readln().trim()))

private fun isPalindrome(valor: String) = valor.equals(valor.reversed(), ignoreCase = true)