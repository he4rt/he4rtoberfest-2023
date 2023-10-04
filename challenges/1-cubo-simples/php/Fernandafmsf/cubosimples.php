<?php
$number= $argv; 

//funcao para percorrer todo o array. Definir a var $i como 1 é imprescindivel para o codigo funcionar, visto que $argv[0] é uma string (nome do projeto)
//count -> tamanho do array
function calcularCubo($number)
{
  for($i=1; $i<count($number); $i++){
      echo "O cubo de " . $number[$i] . " é " . pow($number[$i],3). "\n";    
  }
}

calcularCubo($number);


