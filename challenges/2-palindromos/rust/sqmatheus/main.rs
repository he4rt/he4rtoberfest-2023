fn is_palindrome(word: String) -> bool {
    word.chars().collect::<Vec<char>>() == word.chars().rev().collect::<Vec<char>>()
}

fn main() {
    for arg in std::env::args().skip(1) {
        println!(
            "{arg} {}",
            if is_palindrome(arg.to_lowercase()) {
                "é um palíndromo"
            } else {
                "não é um palíndromo"
            }
        )
    }
}
