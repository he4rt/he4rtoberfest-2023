const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const sortLetters = (word) => {
  const sorted = word.split('').sort().join('');
  return sorted;
};

rl.question('', (word) => {
  console.log(sortLetters(word));
  rl.close();
});
