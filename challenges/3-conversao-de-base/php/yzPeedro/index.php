<?php

if(! isset($argv[1])) {
    die('Por favor informe um número para conversão');
}

if(! is_numeric($argv[1])) {
    die('Por favor informe um número válido');
}

echo base_convert($argv[1], 10, 2);