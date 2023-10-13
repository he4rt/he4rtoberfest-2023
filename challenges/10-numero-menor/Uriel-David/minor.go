package main

import (
	"fmt"
	"sort"
	"strconv"
)

func main() {
	for {
		var input string
		fmt.Print("Digite um número que deseja verificar: ")
		fmt.Scanln(&input)

		number, err := strconv.Atoi(input)
		if err != nil {
			fmt.Println()
			fmt.Println("Entrada inválida. Por favor, digite um número válido.")
			fmt.Println()
		}

		result := calcMinorNumber(number, number-1)
		fmt.Println(result)
		fmt.Println()
	}
}

func calcMinorNumber(num1, number2 int) int {
	str1 := strconv.Itoa(num1)
	str2 := strconv.Itoa(number2)

	sorted1 := []rune(str1)
	sort.Slice(sorted1, func(i, j int) bool { return sorted1[i] < sorted1[j] })
	sorted2 := []rune(str2)
	sort.Slice(sorted2, func(i, j int) bool { return sorted2[i] < sorted2[j] })

	if len(sorted1) > len(sorted2) || number2 < 10 {
		return -1
	}

	if string(sorted1) == string(sorted2) {
		return number2
	}

	return calcMinorNumber(num1, number2-1)
}
