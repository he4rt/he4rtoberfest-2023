const baseDec = process.argv.slice(2)

for (var i = 0; i < baseDec.length; i++){
    let num = Number(baseDec[i])
    let div = Math.floor(num / 2)
    let restos = []
    let rest = num % 2
    restos.push(rest)

    while(div > 2) {
        div = Math.floor(div / 2)
        rest = div % 2
        restos.push(rest)     
        var bin0 = div        
    }

    if (div == 2){
        bin0 = Math.floor(div/2)
        rest = div % 2
        restos.push(rest)
    }

    let arrayBin = [bin0, restos.join('')]
    console.log(`${num} = ${arrayBin.join('')}`)
}
