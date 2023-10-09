fn is_prime(num: u64) -> bool {
    if num <= 1 {
        return false;
    }
    for i in (2..num).rev() {
        if num % i == 0 {
            return false;
        }
    }
    true
}

fn main() {
    for arg in std::env::args().skip(1) {
        match arg.parse::<u64>() {
            Ok(n) => println!(
                "{n} {}",
                if is_prime(n) {
                    "é primo"
                } else {
                    "não é primo"
                }
            ),
            Err(_) => println!("Argumento inválido: {arg}"),
        }
    }
}
