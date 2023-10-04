function verifSeEpalindromo(palavra) {
    palavra = palavra.toLowerCase()
    return palavra === palavra.split('').reverse().join('')
}

console.log(verifSeEpalindromo('isadora'))