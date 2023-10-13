fn main() {
    let s = get_number();

    if s < 0 {
        println!("Número inválido!");

        return;
    }

    let cube = s.pow(3);

    println!("{}", cube);
}

fn get_number() -> isize {
    use std::io::{stdin, stdout, Write};

    let mut s = String::new();

    println!("Por favor insira o número:");
    let _ = stdout().flush();

    stdin().read_line(&mut s).expect("Insira um texto válido!");

    if let Some('\n') = s.chars().next_back() {
        s.pop();
    }

    if let Some('\r') = s.chars().next_back() {
        s.pop();
    }

    let number :isize = s.parse().unwrap_or(-1);

    number
}