fn main() {
    for arg in std::env::args().skip(1) {
        match arg.parse::<i64>() {
            Ok(n) => println!("{}", n.pow(3)),
            Err(_) => println!("Argumento inválido: {}", arg),
        }
    }
}
