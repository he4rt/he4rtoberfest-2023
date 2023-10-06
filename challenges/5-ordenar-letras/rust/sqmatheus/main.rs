fn main() {
    for arg in std::env::args().skip(1) {
        let mut chs: Vec<char> = arg.chars().collect();
        chs.sort_by(|a, b| a.cmp(b));
        println!("{}", chs.into_iter().collect::<String>());
    }
}
