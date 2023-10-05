use std::env;

fn main() {
    let args: Vec<String> = env::args().collect();

    if args.len() < 2 {
        eprintln!("Nenhum argumento foi fornecido.");
        return;
    }

    let valor_emprestimo = args[1].parse::<f64>().unwrap();
    let taxa_juros = args[2].parse::<f64>().unwrap();
    let tempo = args[3].parse::<f64>().unwrap();

    let resultado = valor_emprestimo * (1.0 + taxa_juros / 100.0).powf(tempo);

    println!("{:.2}", resultado);

}
