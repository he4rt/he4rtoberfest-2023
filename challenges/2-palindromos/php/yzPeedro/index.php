<?php

if(! isset($argv[1])) {
    die('Por favor, informe uma palavra para verificar se é um palíndromo');
}

if (is_numeric($argv[1])) {
    die('Não são aceitos valores numéricos, por favor, informe uma palavra');
}

$word = strtolower($argv[1]);
echo $word === strrev($word) ? "true" : "false";
