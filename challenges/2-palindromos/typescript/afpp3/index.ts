import { createInterface } from 'readline'

const readline = createInterface({
  input: process.stdin,
  output: process.stdout,
});

const formatWord = (word: string) => word.toLowerCase().replace(/\s/g, '')

const isPalindrome = (input: string) => {
  const formatedWord = formatWord(input)
  const reversedWord = formatedWord.split('').reverse().join('')

  return formatedWord === reversedWord
}

readline.question('Digite uma palavra para saber se ela é um Palíndromo: ', (input: string) => {
  console.log(isPalindrome(input))
  readline.close()
})
