const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const isPrime = (number) => {
  if (number < 2) {
    throw new Error('A prime number cannot be negative nor less than 2');
  }

  for (let i = 2; i <= number; i++) {
    if (number % i == 0 && i != number) {
      return false;
    }
  }

  return true;
};

rl.question('', (number) => {
  console.log(isPrime(number));
  rl.close();
});
