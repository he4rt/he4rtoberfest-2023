const num = process.argv[2];
let rests = [];

 function isPrimo(num) {
  if (num <= 1) {
    return false;
  } else {
    for (let i = 1; i <= num; i++) {
      var rest = num % i;
      rests.push(rest);
    }
    let zeros = rests.filter((resto0) => resto0 == 0);
    if (zeros.length <= 2){
        return true
     } else{
        return false
     }
  }
} 
console.log(isPrimo(num));

