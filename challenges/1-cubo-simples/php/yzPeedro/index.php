<?php

if (!isset($argv[1]) || !isset($argv[2]) || !isset($argv[3])) {
    die('Erro: Por favor insira todos os parâmetros para prosseguir');
}

foreach (range(1, 3) as $index) {
    if (!is_numeric($argv[$index])) {
        die('Erro: Por favor insira apenas parâmetros numéricos');
    }

    echo pow($argv[$index], 3) . PHP_EOL;
}

