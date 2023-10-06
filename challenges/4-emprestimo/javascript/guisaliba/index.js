const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const calcLoan = (amount, fee, years) => {
  const loan = amount * (1 + fee / 100) ** years;
  return loan.toFixed(2);
};

rl.question('', (input) => {
  const arr = input.split(', ').map((n) => parseInt(n));

  let nums = [];

  arr.forEach((n) => {
    nums.push(n);
  });

  a = nums[0];
  f = nums[1];
  y = nums[2];

  console.log(calcLoan(a, f, y));
  rl.close();
});
