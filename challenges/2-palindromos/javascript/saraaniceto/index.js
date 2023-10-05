// Recebe as palavras como argumento na linha de comando e o slice(2) cria um array com as palavras ignorando os argumentos de execução do Node
const inPalavra = process.argv.slice(2)

// Percorre cada argumento dado, cria e valida o palíndromo
let i = 0
while (i < inPalavra.length) {
    // Uniformiza a case
    let palavra = inPalavra[i].toLowerCase()
    // Cria um array com cada caractere da palavra
    let arPalavra = palavra.split('')
    // Inverte a ordem do array e reune os caracteres criando o palíndromo
    let palindromo = arPalavra.reverse().join('')
    console.log (palavra == palindromo)
    i++
}