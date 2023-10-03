import * as readline from "readline";

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

rl.question("input: ", (input) => {
  
  function palindromo(str: string) {
    str = str.toLowerCase().replace(/ /g, "");

    const reversedStr = str.split("").reverse().join("");

    return str === reversedStr;
  }

  console.log(palindromo(input));
  rl.close();
});
