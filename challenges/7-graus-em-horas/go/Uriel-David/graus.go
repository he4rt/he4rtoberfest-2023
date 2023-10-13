package main

import (
	"fmt"
)

func main() {
	fmt.Print("Digite o ângulo em graus para converter em horas: ")
	var angle int
	fmt.Scan(&angle)
	fmt.Println()

	horas, minutos := degreesToHours(angle)
	fmt.Printf("O ângulo de %d graus corresponde a este valor abaixo:\n\n", angle)
	fmt.Printf("%d:%02d\n", horas, minutos)
}

func degreesToHours(angle int) (int, int) {
	degreesPerHour := 360 / 12
	hours := angle / degreesPerHour
	minutes := (angle % degreesPerHour) * 60 / degreesPerHour

	return hours, minutes
}
