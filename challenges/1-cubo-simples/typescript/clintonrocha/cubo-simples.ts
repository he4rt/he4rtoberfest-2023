import * as readline from "readline";

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

rl.question("number: ", (input) => {
  const number = parseFloat(input);

  if (!isNaN(number)) {
    const cube = number ** 3;

    console.log(`${number} **3: ${cube}`);
  } else {
    console.log("Invalid input.");
  }

  rl.close();
});
