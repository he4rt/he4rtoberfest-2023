package main

import (
	"fmt"
	"math"
	"os"
	"strconv"
)

func main() {
	number, err := strconv.ParseFloat(os.Args[1], 64)
	if err != nil {
		error_message := fmt.Sprintf("Error: %v", err)
		fmt.Println(error_message)
		return
	}
	fmt.Println(number_to_cube(number))
}

func number_to_cube(number float64) float64 {
	return math.Pow(number, 3)
}
