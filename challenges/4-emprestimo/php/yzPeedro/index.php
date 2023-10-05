<?php

$valorEmprestimo = $argv[1];
$valorTaxaJuros = $argv[2];
$tempoAnos = $argv[3];

$valorFinal = $valorEmprestimo * (1 + ($valorTaxaJuros / 100)) ** $tempoAnos;

echo number_format($valorFinal, 2, '.', '');