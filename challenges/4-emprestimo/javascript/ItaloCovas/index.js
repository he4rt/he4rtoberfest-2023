const loanValue = parseInt(process.argv[2].slice(0, -1)); // Removendo a virgula e tornando o número inteiro
const interestRate = process.argv[3].slice(0, -1);
const timeInYears = process.argv[4];

const finalValue = (
  loanValue * Math.pow(1 + interestRate / 100, timeInYears)
).toFixed(2);

console.log(finalValue);
