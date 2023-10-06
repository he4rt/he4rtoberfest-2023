const graus = process.argv[2]
let grauHora = 180 / 6
let grauMinuto = grauHora / 60
 
let horas = parseInt(graus / grauHora)
let minutos = parseInt((graus % grauHora) / grauMinuto)

if (minutos < 10){
    console.log(`${horas}:0${minutos}`)
} else {
console.log(`${horas}:${minutos}`)
}

