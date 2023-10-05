<?php

if (! isset($argv[1])) {
    exit('Por favor insira um um valor para prosseguir.');
}

if (! is_numeric($argv[1])) {
    exit('Por favor insira um valor numérico.');
}

$grauHora = 360 / 12;
$grauMinuto = ($grauHora) / 60;
$input = $argv[1];

$hora = floor($input / $grauHora) == 0 ? 12 : floor($input / $grauHora);
$minutos = floor($input % ($grauHora) / $grauMinuto) == 0 ? "00" : floor($input % ($grauHora) / $grauMinuto);

echo "$hora:$minutos";