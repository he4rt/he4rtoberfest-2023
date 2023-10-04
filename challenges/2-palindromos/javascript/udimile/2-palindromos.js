const palavras = process.argv.slice(2)

for (let i = 0; i < palavras.length; i++) {

    const normal = palavras[i].toLowerCase()
    const invertido = palavras[i].toLowerCase().split('').reverse().join('')
    console.log(normal === invertido)
}
