const word = process.argv[2]
let newWord = word.split('').sort().join('')
console.log(newWord)
