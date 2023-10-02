<?php

function eleva_ao_cubo(int $num1, int $num2): int
{
    return $num1 * $num2;
};

$args = [$argv[1], $argv[2]];
print "O cubo de " .  implode(" e ", $args). " é " . eleva_ao_cubo($argv[1], $argv[2]);