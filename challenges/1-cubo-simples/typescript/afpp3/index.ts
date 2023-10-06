// const inputValue = process.argv
import { createInterface } from 'readline'

const getOnCubeValueFromInput = (input: string) => Math.pow(Number(input), 3)

const readline = createInterface({
  input: process.stdin,
  output: process.stdout,
})

readline.question('Informe um  número para saber o valor elevado ao cubo : ', (input: string) => {
  const result = getOnCubeValueFromInput(input)
  
  if (!isNaN(result)) {
    console.log(`${input} elevado ao cubo é = ${result}`)
  } else {
    console.log('Por favor insira apenas números')
  }

  readline.close();
})

