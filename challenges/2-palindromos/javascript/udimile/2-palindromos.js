const palindromo = (palavra) => {
    palavra = palavra.toLowerCase()
    return palavra === palavra.split('').reverse().join('')
}

console.log(palindromo("Ama"))
console.log(palindromo('udimile'))