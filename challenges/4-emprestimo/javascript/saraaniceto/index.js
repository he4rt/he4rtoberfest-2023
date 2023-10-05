const [emprestimo, juros, tempo] = process.argv.slice(2)

let valorFinal = emprestimo * Math.pow((1 + juros / 100), tempo)

console.log(valorFinal.toFixed(2))