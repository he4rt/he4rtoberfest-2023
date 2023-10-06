package main

import (
	"fmt"
	"os"
	"sort"
	"strings"
)

func main() {
	word := os.Args[1]
	orderned_word := sort_word(word)
	fmt.Println(orderned_word)
}

func sort_word(word string) (sorted_word string) {
	word_to_array := strings.Split(word, "")
	sort.Strings(word_to_array)
	sorted_word = strings.Join(word_to_array, "")
	return
}
