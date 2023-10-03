package main

import "fmt"

func square(x int) int {
	return x * x * x
}

func main() {
	var value int
	fmt.Print("Digite um valor inteiro: ")
	_, err := fmt.Scanf("%d", &value)
	if err != nil {
		fmt.Println("Erro: ", err)
	}
	result := square(value)
	fmt.Println(result)
}
