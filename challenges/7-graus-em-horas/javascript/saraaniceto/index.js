const graus = process.argv[2]
let grauHora = 180 / 6
let grauMinuto = grauHora / 60
 
let minutos = graus / grauMinuto
let horas = parseInt( minutos / 60 )
minutos = minutos % 60

if (minutos < 10){
    console.log(`${horas}:0${minutos}`)
} else {
console.log(`${horas}:${minutos}`)
}

