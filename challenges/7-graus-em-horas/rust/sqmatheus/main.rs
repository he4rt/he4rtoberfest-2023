fn main() {
    for arg in std::env::args().skip(1) {
        match arg.parse::<u64>() {
            Ok(n) => println!("{}:{:02}", n / 30, (n % 30) * 2),
            Err(_) => println!("Argumento inválido: {}", arg),
        }
    }
}
