function verifSeEpalindromo(palavra) {
    palavra = palavra.toLowerCase()
    return palavra === palavra.split('').reverse().join('')
}

const palavra = process.argv[2]

if (palavra){
    const resultado = verifSeEpalindromo(palavra);
    console.log(resultado)
}
