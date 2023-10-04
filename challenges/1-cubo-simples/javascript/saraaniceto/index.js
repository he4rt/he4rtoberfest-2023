const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('Digite um número: ', (num) => {
let cubo = Math.pow(num, 3)
console.log(`O cubo de ${num} é ${cubo}.`)
rl.close()
});