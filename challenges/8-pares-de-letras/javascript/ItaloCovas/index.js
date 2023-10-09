const stringArgs = process.argv[2]; // Os dois primeiros itens do array são reservados para o executável Node.js e o nome do arquivo

if (!stringArgs) {
  console.log("Informe o texto de entrada.");
  return;
}

const array = stringArgs.split("", stringArgs.length);

for (let i = 0; i < array.length; i++) {
  if ((array[i] + array[i + 1]).includes("undefined")) {
    array[i] = (array[i] + array[i + 1]).replace("undefined", "$");
    console.log(array);
    return;
  }
  array[i] = array[i] + array[i + 1];
  array.splice(i + 1, 1);
}

console.log(array);
