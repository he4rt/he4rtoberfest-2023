package main

import (
	"fmt"
	"os"
	"strconv"
)

func main(){
	number, _ := strconv.Atoi(os.Args[1])
	fmt.Println(cube(number))
}

func cube(number int) int {
	return number * number * number
}