const word = process.argv[2];

const formattedWord = word.toLowerCase();

const reversedWord = formattedWord.split("").reverse().join("");

console.log(formattedWord === reversedWord);
