import process from 'process'

interface phraseProps {
  [key: number]: string
}

const args = process.argv[2].split(' ')

const phrases: phraseProps = {
    0: `Ninguem curtiu isso.`,
    1: `${args[0]} curtiu isso.`,
    2: `${args[0]} e ${args[1]} curtiram isso.`,
    3: `${args[0]}, ${args[1]} e ${args[2]} curtiram isso.`,
    4: `${args[0]}, ${args[1]} e outras ${args.length - 2} pessoas curtiram isso`
}

console.log(phrases[args.length <= 4 ? args.length : 4])