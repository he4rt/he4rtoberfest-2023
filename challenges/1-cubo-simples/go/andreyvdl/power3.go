package main

import (
	"errors"
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
		err = powerOf3(scannedNumber)
		if err != nil {
			println("Your number generated an overflow")
			os.Exit(1)
		}
		os.Exit(0)
	} else if len(os.Args) > 2 {
		fmt.Println("Too many args")
		os.Exit(1)
	}
	number, err := strconv.ParseInt(os.Args[1], 10, 64)
	if err != nil {
		fmt.Println("Error: ", err)
		os.Exit(1)
	}
	err = powerOf3(number)
	if err != nil {
		println("Your number generated an overflow")
		os.Exit(1)
	}
	os.Exit(0);
}

func powerOf3(number int64) (error) {
	var overflow int64

	overflow = number * number * number
	if overflow / number / number != number {
		return errors.New("overflow")
	}
	fmt.Println(overflow)
	return nil
}
