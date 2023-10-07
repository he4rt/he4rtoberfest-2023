import os

fn is_palindrome(s string) bool {
		mut word := s.replace(" ", "").to_lower()
		reversed := word.reverse()
		return word == reversed
}

fn main() {
		word := os.args[1]
		println(is_palindrome(word))
}