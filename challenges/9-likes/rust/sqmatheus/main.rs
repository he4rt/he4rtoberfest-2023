fn main() {
    let args: Vec<String> = std::env::args().skip(1).collect();
    match args.len() {
        0 => println!("Ninguém curtiu isso"),
        1 => println!("{} curtiu isso", args[0]),
        2 => println!("{} e {} curtiram isso", args[0], args[1]),
        3 => println!("{}, {} e {} curtiram isso", args[0], args[1], args[2]),
        n => println!(
            "{}, {} e outras {} pessoas curtiram isso",
            args[0],
            args[1],
            n - 2
        ),
    }
}
