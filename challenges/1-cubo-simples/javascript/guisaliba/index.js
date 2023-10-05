const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const toTheCube = (input) => {
  const cube = Math.pow(input, 3);
  return cube;
};

rl.question('', (input) => {
  const cube = toTheCube(input);
  console.log(cube);
  rl.close();
});
