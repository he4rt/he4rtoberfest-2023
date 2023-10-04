import * as readline from "readline";

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});
rl.question("number: ", (input: string) => {
  function isPrime(value: string) {
    const newValue = Number(value);
    if (newValue <= 1) {
      return false;
    }
    if (newValue <= 3) {
      return true;
    }

    if (newValue % 2 === 0 || newValue % 3 === 0) {
      return false;
    }

    for (let i = 5; i * i <= newValue; i += 6) {
      if (newValue % i === 0 || newValue % (i + 2) === 0) {
        return false;
      }
    }

    return true;
  }
  console.log(isPrime(input));
  rl.close();
});
