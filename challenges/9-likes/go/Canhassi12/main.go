package main

import (
	"fmt"
	"os"
)

func main() {
	names := os.Args
	names = names[1:]

	if len(names) <= 0 {
		fmt.Println("Ninguém curtiu isso")
		os.Exit(1)
	}
	
	if len(names) == 1 {
		fmt.Println(names[0], "curtiu isso")
		os.Exit(1)
	}

	if len(names) == 2 {
		fmt.Printf("%s, e %s curtiram isso\n", names[0], names[1])
		os.Exit(1)
	}
	
	if len(names) == 3 {
		fmt.Printf("%s, %s, e %s curtiram isso\n", names[0], names[1], names[2])
		os.Exit(1)
	}

	if len(names) > 3 {
		fmt.Printf("%s, %s, e outras %d pessoas curtiram isso\n", names[0], names[1], len(names) - 2)
		os.Exit(1)
	}
}
