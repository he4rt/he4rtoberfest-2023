package main

import (
	"fmt"
	"os"
	"strconv"
)

func main() {
	var scannedNumber int64

	if len(os.Args) < 2 {
		fmt.Println("No argument provided")
		fmt.Print("Please provide your number: ")
		_, err := fmt.Scan(&scannedNumber)
		if err != nil {
			fmt.Println("Error: ", err)
			os.Exit(1)
		}
		powerOf3(scannedNumber)
	} else if len(os.Args) > 2 {
		fmt.Println("Too many args")
		os.Exit(1)
	}
	number, err := strconv.ParseInt(os.Args[1], 10, 64)
	if (err != nil) {
		fmt.Println("Error: ", err)
		os.Exit(1)
	}
	powerOf3(number)
}

func powerOf3(number int64) {
	var overflow int64

	overflow = number * number * number
	if overflow / number / number != number {
		fmt.Println("Error: your number generated a overflow, try a lower number")
		os.Exit(1)
	}
	fmt.Println(overflow)
}
