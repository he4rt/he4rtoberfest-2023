const [emprestimo, juros, tempo] = process.argv[2].split(',')

let valorFinal = +emprestimo * Math.pow((1 + (+juros / 100)), +tempo)

console.log(valorFinal.toFixed(2))
