const numeros = process.argv.slice(2);
const cubos = numeros.map(numero => numero ** 3);

console.log(cubos);
