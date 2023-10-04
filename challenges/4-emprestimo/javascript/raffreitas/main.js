const input = process.argv.slice(-1)[0]

const [value, rate, time] = input.split(',').map(i => parseFloat(i.trim()))

const amount = value * (1 + (rate / 100.0)) ** time

console.log(amount.toFixed(2));