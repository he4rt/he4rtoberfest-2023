<?php
$word=$argv;
function verifyPalindrome($word)
{

  for($i=1;$i<count($word);$i++){

    $word[$i] = strtolower($word[$i]); //transformando letras maiusculas em minusculas
    if(strrev($word[$i]) != $word[$i]){
      echo "false" . PHP_EOL; 
    }else{
      echo "true".PHP_EOL;
    }
    
  }
}

 verifyPalindrome($word);