<?php

if(! isset($argv[1])) {
    exit("Por favor, informe um parametro para ser verificado se é primo ou não.");
}

if (! is_numeric($argv[1])) {
    exit("O parametro informado não é um número.");
}

if ($argv[1] == 1 || $argv[1] < 1) {
    exit("false");
}

$numero = $argv[1];
$divisores = 0;

for ($i = $numero; $i >= 1; $i--) {
    if ($numero % $i === 0) {
        $divisores++;
    }
}

print $divisores === 2 ? "true" : "false";