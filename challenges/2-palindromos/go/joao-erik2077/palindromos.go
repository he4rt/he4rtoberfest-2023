package main

import (
	"fmt"
	"os"
	"strings"
)

func main() {
	word := strings.ToLower(os.Args[1])
	inverted_word := invert_word(word)
	fmt.Println(word == inverted_word)
}

func invert_word(word string) (inverted_word string) {
	for _, char := range word {
		inverted_word = string(char) + inverted_word
	}
	return
}
