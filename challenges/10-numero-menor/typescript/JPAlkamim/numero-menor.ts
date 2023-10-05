import process from 'process'

const hasSameDigits = (number1: number, number2: number): boolean => {
    return number1.toString().split('').sort().join('') === number2.toString().split('').sort().join('')
}

const compareNumbers = (number: number): number => {
    let foundSmallestNumber: number = -1
    let auxNumber: number = 0
    while (auxNumber < number) {
        if (hasSameDigits(auxNumber, number)) {
            foundSmallestNumber = auxNumber
        }
        auxNumber += 1
    }
    return foundSmallestNumber
}

const argNumber: number = Number(process.argv.slice(2))
console.log(compareNumbers(argNumber))