// Importa o objeto 'argv' do módulo 'process' do Node.js para obter argumentos da linha de comando.
const { argv } = require('node:process');

// Loop que começa em 2 para ignorar os dois primeiros argumentos padrão (node e nome do arquivo).
for (let index = 2; index < argv.length; index++) {
  
   // Converte o argumento atual para um número e calcula o cubo dele.
  let cubo = parseInt(process.argv[index]*process.argv[index]*process.argv[index])

    // Verifica se o resultado do cálculo é NaN (não é um número válido).
  if (isNaN(cubo)) {
    console.log("O valor digitado não é um número válido.");

  } else {
    console.log(cubo)
  }
}
