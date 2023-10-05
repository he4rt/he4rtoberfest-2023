type phraseProps = {
    0: string,
    1: string,
    2: string,
    3: string,
    4: string,
  }
  
const input: Array<string> = ["Gustavo"]

const phrases: phraseProps = {
    0: `Ninguem curtiu isso.`,
    1: `${input[0]} curtiu isso.`,
    2: `${input[0]} e ${input[1]} curtiram isso.`,
    3: `${input[0]}, ${input[1]} e ${input[2]} curtiram isso.`,
    4: `${input[0]}, ${input[1]} e outras ${input.length - 2} curtiram isso`
}

console.log(phrases[input.length <= 4 ? input.length : 4])