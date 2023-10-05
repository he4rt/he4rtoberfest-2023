const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const toTheCube = (numbers) => {
  for (const number of numbers) {
    const cube = Math.pow(number, 3);
    console.log(`The cube of ${number} is ${cube}.`);
  }
};

rl.question('Enter numbers separated by a space: ', (input) => {
  const numbers = input.split(' ').map(Number);
  toTheCube(numbers);
  rl.close();
});
