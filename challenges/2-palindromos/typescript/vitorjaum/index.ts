function palindromeChecker(word: string) {
  const firstDirection = [...word];
  const secondDirection = [...word].reverse();
  let isPalindrome = true;

  firstDirection.map((letter, idx) => {
    if (letter != secondDirection[idx]) isPalindrome = false;
  });

  return isPalindrome;
}

const inputValue: string = process.argv[2].toLowerCase();
console.log(palindromeChecker(inputValue));
