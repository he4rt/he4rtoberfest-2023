const baseDec = process.argv.slice(2);

for (var i = 0; i < baseDec.length; i++) {
  let num = +baseDec[i];
  let binario = num.toString(2);
  console.log(binario);

}
