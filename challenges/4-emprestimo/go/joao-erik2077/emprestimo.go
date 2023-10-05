package main

import (
	"fmt"
	"math"
	"strconv"
	"strings"
)

func main() {
	emprestimo, juros, tempo := get_values()

	valor_final := calcular_emprestimo(emprestimo, juros, tempo)

	message := fmt.Sprintf("%.2f", valor_final)
	fmt.Println(message)
}

func get_values() (emprestimo float64, juros_porcentagem float64, tempo float64) {
	values := []string{"", "", ""}
	fmt.Scan(&values[0], &values[1], &values[2])
	parsed_values := parse_values(values)
	emprestimo, _ = strconv.ParseFloat(parsed_values[0], 64)
	juros, _ := strconv.ParseFloat(parsed_values[1], 64)
	tempo, _ = strconv.ParseFloat(parsed_values[2], 64)
	juros_porcentagem = juros / 100
	return
}

func parse_values(values []string) []string {
	for i, v := range values {
		values[i] = strings.Replace(v, ",", "", -1)
	}
	return values
}

func calcular_emprestimo(valor_inicial float64, juros float64, tempo float64) float64 {
	return valor_inicial * math.Pow(1+juros, tempo)
}
