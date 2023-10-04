const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function calcularCubo(numero) {
  return numero ** 3;
}

function solicitarNumero() {
  rl.question('Digite um número (ou "sair" para encerrar): ', (input) => {
    if (input.toLowerCase() === 'sair') {
      rl.close();
    } else {
      const numero = parseFloat(input);
      if (!isNaN(numero)) {
        const cubo = calcularCubo(numero);
        console.log(`O cubo de ${numero} é igual a ${cubo}`);
        solicitarNumero();
      } else {
        console.log('Por favor, insira um número válido.');
        solicitarNumero();
      }
    }
  });
}

solicitarNumero();
