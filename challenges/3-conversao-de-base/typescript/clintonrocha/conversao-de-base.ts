import * as readline from "readline";

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});
rl.question("number: ", (input) => {
  console.log((Number(input) >>> 0).toString(2));
  rl.close();
});
