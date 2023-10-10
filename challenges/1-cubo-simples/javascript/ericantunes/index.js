const readLine = require('readline');

const read = readLine.createInterface({
  input: process.stdin,
  output: process.stdout
});

function calcular(numero) {
  return Math.pow(numero, 3)
}

read.question("Digite um número: ", (numero) => {
 const cubo = calcular(numero);
  
  console.log(`Resultado do ${numero} ao cubo é ${cubo}`)
  
  read.close();
});



