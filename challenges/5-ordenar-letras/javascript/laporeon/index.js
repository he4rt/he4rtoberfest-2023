const word = process.argv[2];

const ordered = word.split("").sort().join("");

console.log(ordered);
