package main

import (
	"fmt"
)

func main() {
	var input string

	fmt.Print("Enter with a word: ")

	_, err := fmt.Scanf("%s", &input)

	if err != nil {
		fmt.Println("Error reading input: ", err)
		return
	}

	result := reverse(input)

	if result == input {
		fmt.Println(true)
	} else {
		fmt.Println(false)
	}

}

func reverse(str string) (result string) {
	for _, v := range str {
		result = string(v) + result
	}
	return
}
