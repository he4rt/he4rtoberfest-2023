import * as readline from "readline";

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});
rl.question("string: ", (input) => {
   const palavra = input.replace(/[^a-zA-Z]/g, '');
   const letrasOrdenadas = palavra.split('').sort().join('');
   console.log(letrasOrdenadas)
  rl.close();
});
