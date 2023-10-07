package main

import (
	"fmt"
	"sort"
	"strings"
)

func main() {
	var word string
	fmt.Print("Digite uma palavra: ")
	fmt.Scan(&word)

	letter := strings.Split(word, "")
	sort.Strings(letter)

	sortWord := strings.Join(letter, "")
	fmt.Println("Palavra ordenada alfabeticamente:", sortWord)
}
