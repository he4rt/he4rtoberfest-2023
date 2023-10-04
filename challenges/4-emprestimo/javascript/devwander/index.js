const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

function calcularEmprestimo() {
  rl.question(
    "Digite: valor do empréstimo, taxa de juros e tempo em anos (ex: 1000.00, 10, 1): ",
    (input) => {
      inputArray = input.trim().split(",");

      if (inputArray.length === 3) {
        valor_emprestimo = inputArray[0];
        taxa_juros = inputArray[1];
        tempo = inputArray[2];

        const valor_final =
          valor_emprestimo * Math.pow(1 + taxa_juros / 100, tempo);
        console.log(`O valor final a ser pago é: ${valor_final.toFixed(2)}`);

        rl.close();
      } else {
        console.log("Input inválido!")
        calcularEmprestimo();
      }
    }
  );
}

calcularEmprestimo();
