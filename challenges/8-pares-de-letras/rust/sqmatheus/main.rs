fn main() {
    for arg in std::env::args().skip(1) {
        let chs: Vec<char> = arg.chars().collect();

        let mut pairs: Vec<String> = chs
            .chunks(2)
            .map(|c| c.iter().collect::<String>())
            .collect();

        if chs.len() % 2 != 0 {
            pairs.last_mut().unwrap().push('$');
        }

        println!("{:?}", pairs);
    }
}
