package ericoliveiras

import (
	"fmt"
	"math"
	"os"
	"strconv"
)

func main() {
	arg := os.Args[1]

	number, err := strconv.ParseFloat(arg, 64)
	if err != nil {
		fmt.Println(err)
	}

	result := math.Pow(number, 3)

	fmt.Printf("%.f³ = %.f\n", number, result)
}
