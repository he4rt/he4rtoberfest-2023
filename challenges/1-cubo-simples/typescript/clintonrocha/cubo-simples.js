"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var readline = require("readline");
var rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
});
rl.question("number: ", function (input) {
    var number = parseFloat(input);
    if (!isNaN(number)) {
        var cube = Math.pow(number, 3);
        console.log("".concat(number, " **3: ").concat(cube));
    }
    else {
        console.log("Invalid input.");
    }
    rl.close();
});
