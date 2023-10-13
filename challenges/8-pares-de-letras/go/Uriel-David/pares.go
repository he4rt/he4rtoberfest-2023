package main

import (
	"fmt"
	"strings"
)

func main() {
	var input string
	fmt.Print("Digite a string a se verificar: ")
	fmt.Scan(&input)

	pairs := splitStringIntoPairs(input)
	fmt.Print("['")
	fmt.Print(strings.Join(pairs, "', '"))
	fmt.Println("']")
}

func splitStringIntoPairs(input string) []string {
	var pairs []string
	length := len(input)

	for i := 0; i < length; i += 2 {
		if i+1 < length {
			pairs = append(pairs, input[i:i+2])
		} else {
			pairs = append(pairs, input[i:i+1]+"$")
		}
	}

	return pairs
}
