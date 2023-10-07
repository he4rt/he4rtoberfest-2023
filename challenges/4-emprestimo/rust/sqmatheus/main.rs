fn main() {
    let mut input = String::new();
    std::io::stdin().read_line(&mut input).unwrap();

    let nums = input
        .split(',')
        .map(|x| x.trim().parse::<f64>().expect("Entrada inválida"))
        .collect::<Vec<f64>>();

    if nums.len() < 3 {
        eprintln!("Entrada insuficiente");
        return;
    }

    let res = nums[0] * (1.0 + nums[1] / 100.0).powf(nums[2]);

    println!("{:.2}", res)
}
