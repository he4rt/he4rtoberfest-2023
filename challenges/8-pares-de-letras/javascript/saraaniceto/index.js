//Seu objetivo é criar um programa que faça a leitura de uma string e retorne a string dividida em pares, com o último espaço sendo ocupado por "$" caso a quantidade de letras seja ímpar.

let string = process.argv[2]
if (string.length % 2 != 0) {
    string += '$'
}
let pares = string.match(/.{2}/g) ?? []
console.log(pares)
