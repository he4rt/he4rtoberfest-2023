import * as readline from "readline"

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
  });
  rl.question("number: ", (input) => {
    const valor_emprestimo = parseFloat(input.split(",")[0]);
    const taxa_juros = parseInt(input.split(",")[1]);
    const tempo = parseInt(input.split(",")[2]);
    const valor_final = valor_emprestimo * (1 + taxa_juros / 100) ** tempo;
    console.log(valor_emprestimo, taxa_juros, tempo)
    console.log(valor_final.toFixed(2));
    rl.close();
  });