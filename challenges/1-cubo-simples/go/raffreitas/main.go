package main

import (
	"fmt"
	"math"
)

func main() {
	var number int
	fmt.Println("Digite um numero")
	fmt.Scanln(&number)
	cube := math.Pow(float64(number), 3)
	fmt.Println(cube)
}
