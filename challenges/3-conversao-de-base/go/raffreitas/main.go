package main

import (
	"fmt"
	"strconv"
	"strings"
)

func reverse(arr []string) []string {
	for i, j := 0, len(arr)-1; i < j; i, j = i+1, j-1 {
		arr[i], arr[j] = arr[j], arr[i]
	}
	return arr
}

func toBinary(value int) string {
	var modArr []string
	for i := 0; value != 0; i++ {
		modArr = append(modArr, strconv.Itoa(value%2))
		value /= 2
	}
	var reversed = reverse(modArr)
	var numberInBinary = strings.Join(reversed, "")
	return numberInBinary
}

func main() {
	var number int
	fmt.Scanln(&number)

	if number == 0 {
		fmt.Println(0)
	} else {
		fmt.Println(toBinary(number))
	}
}
