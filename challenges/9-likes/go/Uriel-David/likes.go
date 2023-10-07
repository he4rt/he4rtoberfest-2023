package main

import (
	"bufio"
	"fmt"
	"os"
	"strings"
)

func main() {
	fmt.Print("Digite os nomes no formato ['Nome1', 'Nome2', ...]: ")
	reader := bufio.NewReader(os.Stdin)
	input, _ := reader.ReadString('\n')

	input = strings.ReplaceAll(input, "[", "")
	input = strings.ReplaceAll(input, "]", "")
	input = strings.ReplaceAll(input, "'", "")
	input = strings.TrimSpace(input)

	likes := strings.Split(input, ",")
	formattedLikes := formatLikes(likes)
	fmt.Println(formattedLikes)
}

func formatLikes(names []string) string {
	lenNames := len(names)

	if names[0] == "" {
		return "Ninguém curtiu isso"
	} else if lenNames == 1 {
		return fmt.Sprintf("%s curtiu isso", names[0])
	} else {
		phrase := names[0]
		for i := 1; i < lenNames-1; i++ {
			phrase += fmt.Sprintf(", %s", names[i])
		}
		phrase += fmt.Sprintf(" e%s curtiram isso", names[lenNames-1])

		return phrase
	}
}
