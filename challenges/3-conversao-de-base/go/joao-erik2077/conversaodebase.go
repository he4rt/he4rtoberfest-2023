package main

import (
	"fmt"
	"os"
	"strconv"
)

func main() {
	number, err := strconv.Atoi(os.Args[1])
	if err != nil {
		error_message := fmt.Sprintf("Error: %v", err)
		fmt.Println(error_message)
		return
	}
	message := fmt.Sprintf("%b", number)
	fmt.Println(message)
}
