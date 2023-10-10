package main

import (
	"fmt"
	"math"
)

func main() {
	var input float64

	fmt.Print("Enter with a number: ")

	_, err := fmt.Scanf("%f", &input)

	if err != nil {
		fmt.Println("Error reading input: ", err)
		return
	}

	result := toCube(input)

	fmt.Println(int(result))
}

func toCube(number float64) float64 {
	return math.Pow(number, 3)
}
