package main

import (
	"fmt"
	"math"
	"strconv"
)

func main() {
	for {
		fmt.Print("Digite um número que deseja calcular seu valor ao cubo: ")
		input := readInput()

		number, err := strconv.ParseFloat(input, 64)
		if err != nil {
			voidLine()
			fmt.Println("Erro: Entrada inválida. Certifique-se de inserir um número válido.")
			voidLine()
			continue
		}

		cube := math.Pow(number, 3)
		voidLine()
		fmt.Printf("O cubo de %.2f é %.2f\n", number, cube)
		break
	}
}

func readInput() string {
	var input string
	fmt.Scanln(&input)
	return input
}

func voidLine() {
	fmt.Println()
}
