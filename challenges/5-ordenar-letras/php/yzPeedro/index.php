<?php

if(! isset($argv[1])) {
    die("Por favor, um parametro como argumento.");
}

if(is_numeric($argv[1])) {
    die("Por favor, informe uma palavra como argumento.");
}

$letras = str_split($argv[1]);
sort($letras);

echo implode('', $letras);