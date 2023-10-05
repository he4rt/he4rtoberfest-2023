package main

import (
	"fmt"
	"os"
)

func main() {
	if len(os.Args) < 1 {
		fmt.Println("Usage: go run cubo.go <number>")
		os.Exit(1)
	}

	var n int
	fmt.Sscanf(os.Args[1], "%d", &n)

	fmt.Printf("%d\n", n*n*n)
}
