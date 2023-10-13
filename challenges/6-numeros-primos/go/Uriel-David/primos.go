package main

import (
	"fmt"
	"math"
)

func main() {
	var number int
	fmt.Print("Digite um número para verificar se ele é primo: ")
	fmt.Scan(&number)

	if isPrime(number) {
		fmt.Println(true)
	} else {
		fmt.Println(false)
	}
}

func isPrime(number int) bool {
	if number <= 1 {
		return false
	}

	if number <= 3 {
		return true
	}

	if number%2 == 0 || number%3 == 0 {
		return false
	}

	limit := int(math.Sqrt(float64(number)))

	for i := 5; i <= limit; i += 6 {
		if number%i == 0 || number%(i+2) == 0 {
			return false
		}
	}

	return true
}
