function main(input) {
    console.log((input % 2 == 0 && input > 1)? "Número primo" : "Número não primo");
}


main(process.argv[2]);