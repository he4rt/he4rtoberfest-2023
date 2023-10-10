const stringArgs = process.argv[2]; // Os dois primeiros itens do array são reservados para o executável Node.js e o nome do arquivo

if (!stringArgs) {
  console.log("Informe o número de entrada.");
  return;
}

const number = parseFloat(stringArgs);

if (isNaN(number)) {
  console.log("Informe um número válido.");
  return;
}

const numberRaised = Math.pow(number, 3);

console.log(numberRaised);
