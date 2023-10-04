const numeros = process.argv.slice(2)

for (let i = 0; i < numeros.length; i++) {
    console.log(parseInt(numeros[i]).toString(2))
}
