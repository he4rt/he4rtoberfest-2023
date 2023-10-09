const inNum = process.argv[2]
var allNum = []

// Função pra validar o número
function validar() {
  if (inNum < 10) {
    return false
  }

  for (let i = 0; i < inNum.length; i++) {
    if (
      inNum.slice(0, 1) != inNum.slice(i, i++) &&
      inNum.split("").sort().join("") != inNum
    ) {
      return true
    } else {
      return false
    }
  }
}

// Função para executar a permutação
function permutar(input, result) {
  if (input.length == 0) {
    allNum.push(result)
  }
  for (let i = 0; i < input.length; i++) {
    let rest = input.substring(0, i) + input.substring(i + 1)
    permutar(rest, result + input[i])
  }
}

// Aplicar o input
if (validar(inNum)) {
  permutar(inNum, "")

  // Função pra reordenar o array em ordem numérica
  function compareNumbers(a, b) {
    return a - b
  }
  allNum.sort(compareNumbers)

  // Achar o menor número
  let menorNum = allNum[allNum.indexOf(inNum) - 1]
  if (menorNum.startsWith("0")) {
    console.log(-1)
  } else {
    console.log(menorNum)
  }
} else {
  console.log(-1)
}
