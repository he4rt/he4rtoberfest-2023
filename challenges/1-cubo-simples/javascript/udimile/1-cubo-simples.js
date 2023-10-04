const numeros = process.argv.slice(2)

for (let i = 0; i < numeros.length; i++) {
    console.log(numeros[i] ** 3)
}