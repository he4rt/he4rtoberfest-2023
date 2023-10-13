package main

import (
	"fmt"
	"math"
	"strconv"
	"strings"
)

func main() {
	for {
		fmt.Println("Calculadora de Empréstimo")
		fmt.Print("Digite o valor do empréstimo, taxa de juros em \\% \\e o tempo em anos (Separado por vírgula -> 100, 2, 1): ")
		loanValueStr := readInput()

		if len(loanValueStr) != 3 {
			fmt.Println("Alguns ou todos os valores informados estão em formato inválido, por favor coloque novamente valores válidos.")
			voidLine()
			continue
		}

		loanValue, err := strconv.ParseFloat(loanValueStr[0], 64)
		if err != nil {
			fmt.Println("Valor do empréstimo inválido.")
			continue
		}

		feeTaxs, err := strconv.ParseInt(loanValueStr[1], 10, 64)
		if err != nil {
			fmt.Println("Valor das taxas em percetagem inválido.")
			continue
		}

		years, err := strconv.ParseInt(loanValueStr[2], 10, 64)
		if err != nil {
			fmt.Println("Valor do tempo em anos inválido.")
			continue
		}

		finalValue := calcFinalLoanValue(loanValue, feeTaxs, years)
		fmt.Printf("Valor final do empréstimo: %.2f\n", finalValue)
		voidLine()

		var anotherTransaction string
		fmt.Print("Deseja realizar outra transação?(S/N): ")
		fmt.Scan(&anotherTransaction)
		if anotherTransaction == "N" || anotherTransaction == "n" {
			break
		}

		voidLine()
		continue
	}
}

func readInput() []string {
	values := make([]string, 3)
	fmt.Scan(&values[0], &values[1], &values[2])
	for i, value := range values {
		values[i] = strings.Replace(value, ",", "", -1)
	}
	return values
}

func calcFinalLoanValue(loanValue float64, taxFee int64, years int64) float64 {
	taxaDecimal := float64(taxFee) / 100
	finalValue := loanValue * math.Pow(1+taxaDecimal, float64(years))

	return finalValue
}

func voidLine() {
	fmt.Println()
}
