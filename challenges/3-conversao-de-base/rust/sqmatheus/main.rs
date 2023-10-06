fn main() {
    for arg in std::env::args().skip(1) {
        match arg.parse::<i64>() {
            Ok(n) => println!("{arg} em binário: {n:b}"),
            Err(_) => println!("Argumento inválido: {}", arg),
        }
    }
}
