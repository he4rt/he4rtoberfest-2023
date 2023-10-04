package main

import (
	"errors"
	"fmt"
	"math"
	"os"
	"strconv"
	"strings"
)

// calculo emprestimo valor_final = valor_emprestimo * (1 + taxa_juros)^tempo

func calculateLoan(loanValue float64, interestRate float64, loanTimeInYears float64) (float64, error) {
	value := loanValue
	rate := interestRate / 100
	timeInYears := loanTimeInYears

	if timeInYears == 0 {
		errors.New("Time in Years must be greater then 0")
		return 0, nil
	}

	amount := value * math.Pow(1+rate, timeInYears)
	return math.Round(amount*100) / 100, nil // returned value must be something like 2.55
}

func main() {
	loanValue, err := strconv.ParseFloat(strings.Trim(os.Args[1], ","), 64)

	if err != nil {
		fmt.Println("O argumento", loanValue, " não é um número válido")
	}

	interest, err := strconv.ParseFloat(strings.Trim(os.Args[2], ","), 64)

	if err != nil {
		fmt.Println("O argumento", interest, " não é um número válido")
	}

	years, err := strconv.ParseFloat(strings.Trim(os.Args[3], ","), 64)

	if err != nil || years == 0 {
		fmt.Println("Years mut be greater than", interest)
	}

	contractedValue, err := calculateLoan(loanValue, interest, years)
	fmt.Println("Amount value to be paid: ", contractedValue)

}
