const argsString = process.argv[2]; // Os dois primeiros itens do array são reservados para o executável Node.js e o nome do arquivo

if (!argsString) {
  console.log("Informe o array de entrada.");
  return;
}

const args = JSON.parse(argsString);

switch (args.length) {
  case 0:
    console.log("Ninguém curtiu isso.");
    break;

  case 1:
    console.log(`${args[0]} curtiu isso`);
    break;

  case 2:
    console.log(`${args[0]} e ${args[1]} curtiram isso`);
    break;

  case 3:
    console.log(`${args[0]}, ${args[1]} e ${args[2]} curtiram isso`);
    break;

  default:
    console.log(
      `${args[0]}, ${args[1]} e outras ${args.length - 2} pessoas curtiram isso`
    );
    break;
}
