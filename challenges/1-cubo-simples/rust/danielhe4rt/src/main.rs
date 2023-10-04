use std::io;

fn main() {
    let mut aux = String::new();

    let _ = io::stdin().read_line(&mut aux);

    
    let result: i32 = aux.trim().parse().unwrap();

    println!("{:?}", result.pow(3));
}
