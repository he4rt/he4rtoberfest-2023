fn main() {
    let args: Vec<String> = std::env::args().collect();

    let loan_value: f64 = args[1].replace(",", "").parse::<f64>().unwrap();
    let interest_rate: f64 = args[2].replace(",", "").parse::<f64>().unwrap();
    let years: f64 = args[3].replace(",", "").parse::<f64>().unwrap();

    let final_value = loan_value * (1.0 + interest_rate / 100.0).powf(years);

    println!("{:.2}", final_value);
}
