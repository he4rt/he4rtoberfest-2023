function main(input) {
    const SEGUNDOS_POR_MINUTO = 3600;
    const graus = input;

    let horas;
    let minutos = 0;
    let minutosCorrigidos;
    let segundosDasHoras;
    let segundosRestantes
    let segundosFinal;

    horas = graus / 30;

    segundosDasHoras = horas * SEGUNDOS_POR_MINUTO;
    segundosRestantes = segundosDasHoras;

    if (!Number.isInteger(horas)) {
        minutos = Math.trunc((segundosRestantes / 60) / 10);
    }

    segundosFinal = segundosRestantes % 60;

    if (segundosRestantes < 60) {
        segundosFinal = Math.trunc(segundosRestantes);
    }

    minutosCorrigidos = minutos % 60;

    console.log(`
        \n
        | ${Math.trunc(horas)} | ${minutosCorrigidos} |
        \n
    `);
}


main(process.argv[2]);