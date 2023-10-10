const num = process.argv[2];

if(!num){
    console.log('Digite um numero')
    return
}else{
    console.log("O numero "+num+" ao cubo resulta em: "+Math.pow(num, 3))
}