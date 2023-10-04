package main

import (
	"fmt"
	"strings"
)

func main() {
	var word string

	fmt.Print("Digite uma palavra e verifique se é um palindromo: ")
	fmt.Scanln(&word)

	resultado := isPalindrome(word)
	fmt.Println()
	fmt.Println(resultado)
}

func isPalindrome(word string) bool {
	word = strings.ToLower(strings.ReplaceAll(word, " ", ""))

	for i, j := 0, len(word)-1; i < j; i, j = i+1, j-1 {
		if word[i] != word[j] {
			return false
		}
	}

	return true
}
