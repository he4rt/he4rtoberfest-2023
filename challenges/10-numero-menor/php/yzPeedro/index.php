<?php

if(! isset($argv[1])) {
    die('Por favor informe o argumento de pesquisa');
}

if(! is_numeric($argv[1])) {
    die('Por favor informe um número inteiro');
}

if($argv[1] < 10) {
    exit('-1');
}

$numero = $argv[1];

// Verifica se todos os digitos são iguais
if (preg_match('/^(.)\1*$/u', $numero)) {
    exit('-1');
}

$primeirosDigitos = substr($numero, 0, -2);
$ultimosDigitos = str_split(substr($numero, -2));

$menorDigito = min($ultimosDigitos);
$ultimosDigitos = ($ultimosDigitos[0] == $menorDigito)
    ? "{$ultimosDigitos[0]}{$ultimosDigitos[1]}"
    : "{$ultimosDigitos[1]}{$ultimosDigitos[0]}";

echo "{$primeirosDigitos}{$ultimosDigitos}";