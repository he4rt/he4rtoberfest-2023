import Foundation

class Palindrome {
    func isPalindrome(_ s: String) -> Bool {
        let alphanumericString = s.lowercased().components(separatedBy: CharacterSet.alphanumerics.inverted).joined()
        return alphanumericString == String(alphanumericString.reversed())
    }
}

let p = Palindrome()
// MARK: - Case tests
print("\"\"", p.isPalindrome("") ? "é um palíndromo" : "não é um palíndromo") // true, string vazia é considerada um palíndromo
print("\"A man a plan a canal Panama\"", p.isPalindrome("A man a plan a canal Panama") ? "é um palíndromo" : "não é um palíndromo") // true, com espaços
print("\"Was it a car or a cat I saw?\"", p.isPalindrome("Was it a car or a cat I saw?") ? "é um palíndromo" : "não é um palíndromo") // true, com pontuação

print("\"Hello, World!\"", p.isPalindrome("Hello, World!") ? "é um palíndromo" : "não é um palíndromo") // false, caracteres não alfanum
print("\"1234567890\"", p.isPalindrome("1234567890") ? "é um palíndromo" : "não é um palíndromo") // false, apenas números

print("\"MaDaM\"", p.isPalindrome("MaDaM") ? "é um palíndromo" : "não é um palíndromo") // true, a função trata letras maiúsculas e minúsculas da mesma maneira
print("\"race car!\"", p.isPalindrome("race car!") ? "é um palíndromo" : "não é um palíndromo") // true, ignorando o ponto de exclamação
print("\"No lemon, no melon\"", p.isPalindrome("No lemon, no melon") ? "é um palíndromo" : "não é um palíndromo") // true, ignorando as vírgulas e espaços

print("\"👍radar👍\"", p.isPalindrome("👍radar👍") ? "é um palíndromo" : "não é um palíndromo") // true, considerando emojis
print("\"öÉö\"", p.isPalindrome("öÉö") ? "é um palíndromo" : "não é um palíndromo") // true, considerando caracteres acentuados
