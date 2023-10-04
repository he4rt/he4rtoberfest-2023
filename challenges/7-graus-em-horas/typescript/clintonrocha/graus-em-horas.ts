import * as readline from "readline";

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

function converterAnguloParaHoras() {
  rl.question("Digite um ângulo (0 a 359 graus): ", (input) => {
    const angulo = Number(input);
    if (angulo >= 0 && angulo < 360) {
      const proporcao = angulo / 360;
      const horas = Math.floor(proporcao * 12);
      const minutos = Math.floor((proporcao * 12 * 60) % 60);
      console.log(`${horas}:${minutos.toString().padStart(2, "0")}`);
      rl.close();
    } else {
      console.log("Ângulo inválido. O ângulo deve estar entre 0 e 359 graus.");
      converterAnguloParaHoras();
    }
  });
}

converterAnguloParaHoras();
