const inputValue = process.argv.slice(2);

function simpleCube(value: string[]) {
  let cubedNumbers: number[] = [];

  for (let index = 0; index < value.length; index++) {
    const baseNumber = Number(value[index]);
    cubedNumbers.push(Math.pow(baseNumber, 3));
  }

  return cubedNumbers;
}

console.log(...simpleCube(inputValue));
