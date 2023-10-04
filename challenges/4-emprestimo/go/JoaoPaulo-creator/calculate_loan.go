package main

import (
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

	if value == 0 {
		fmt.Println("Loan value must be greater than 0")
		return 0, nil
	}

	if rate == 0 {
		fmt.Println("Interest rate must be greater than 0")
		return 0, nil
	}

	if timeInYears == 0 {
		fmt.Println("Time in Years must be greater then 0")
		return 0, nil
	}

	amount := value * math.Pow(1+rate, timeInYears)
	return math.Round(amount*100) / 100, nil // returned value must be something like 2.55
}

func main() {

	if len(os.Args) <= 1 {
		fmt.Println("No arguments were passed")
		return
	}

	loanValue, err := strconv.ParseFloat(strings.Trim(os.Args[1], ","), 64)

	if err != nil {
		fmt.Println("Loan value must be greater than", loanValue)
		return
	}

	interest, err := strconv.ParseFloat(strings.Trim(os.Args[2], ","), 64)

	if err != nil {
		fmt.Println("Interest value must be greater than", loanValue)
		return
	}

	years, err := strconv.ParseFloat(strings.Trim(os.Args[3], ","), 64)

	contractedValue, err := calculateLoan(loanValue, interest, years)
	fmt.Println("Amount value to be paid: ", contractedValue)

}
