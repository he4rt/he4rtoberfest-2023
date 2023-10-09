const stringArgs = process.argv[2]; // Os dois primeiros itens do array são reservados para o executável Node.js e o nome do arquivo

if (!stringArgs) {
  console.log("Informe o texto de entrada.");
  return;
}

const test = stringArgs.split("", stringArgs.length);

for (let i = 0; i < test.length; i++) {
  if ((test[i] + test[i + 1]).includes("undefined")) {
    test[i] = (test[i] + test[i + 1]).replace("undefined", "$");
    console.log(test);
    return;
  }
  test[i] = test[i] + test[i + 1];
  test.splice(i + 1, 1);
}

console.log(test);
