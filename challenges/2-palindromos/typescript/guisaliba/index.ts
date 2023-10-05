import { createInterface } from 'readline';

const rl = createInterface({
  input: process.stdin,
  output: process.stdout,
});

const checkPalindrome = (sentence: string): boolean => {
  const regSentence = sentence.toLowerCase().replace(/\s/g, '');
  const reversed = regSentence.split('').reverse().join('');

  return regSentence === reversed;
};

rl.question('', (sentence: string) => {
  console.log(checkPalindrome(sentence));
  rl.close();
});
