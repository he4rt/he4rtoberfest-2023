package main

import (
	"fmt"
)

func main() {
	var input int

	fmt.Print("Enter with a number: ")

	_, err := fmt.Scanf("%d", &input)

	if err != nil {
		fmt.Println("Error reading input: ", err)
		return
	}

	result := numberToBinary(input)
	fmt.Printf(result)
}

func numberToBinary(number int) string {
	if number == 0 {
		return "0"
	}

	binary := ""
	for number > 0 {
		remainder := number % 2
		binary = fmt.Sprintf("%d%s", remainder, binary)
		number = number / 2
	}

	return binary
}
