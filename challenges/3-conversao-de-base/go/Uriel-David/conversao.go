package main

import (
	"fmt"
	"strconv"
)

func main() {
	var decimalNumber int
	fmt.Print("Digite um número decimal para converter em Binário: ")
	fmt.Scan(&decimalNumber)

	numeroBinario := decimalToBinare(decimalNumber)
	fmt.Println()
	fmt.Printf("O número convertido em binário é: %s\n", numeroBinario)
}

func decimalToBinare(decimalNumber int) string {
	if decimalNumber == 0 {
		return "00000000"
	}

	binareNumber := ""

	for decimalNumber > 0 {
		rest := decimalNumber % 2
		binareNumber = strconv.Itoa(rest) + binareNumber
		decimalNumber = decimalNumber / 2
	}

	for len(binareNumber) < 8 {
		binareNumber = "0" + binareNumber
	}

	return binareNumber
}
