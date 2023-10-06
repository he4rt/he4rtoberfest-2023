const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const decToBinary = (number) => {
  let remainders = [];

  while (number > 0) {
    let remainder = number % 2;
    remainders.push(remainder);
    number = Math.floor(number / 2);
  }

  let binary = remainders.reverse().join('');
  return binary;
};

rl.question('', (input) => {
  console.log(decToBinary(input));
  rl.close();
});
