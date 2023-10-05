<?php

if (! isset($argv[1])) {
    die("Por favor informe o parâmetro de entrada");
}

$strArr = '';
$i = 1;
while (isset($argv[$i])) {
    $strArr .= $argv[$i];
    $i++;
}

$string = str_replace(['[', ']'], '', $strArr);
$likes = array_filter(
    array_map(fn(string $name) => str_replace("'", '', trim($name)),
    explode(',', $string))
);


echo match (count($likes)) {
    0 => "Ninguém curtiu isso",
    1 => "{$likes[0]} curtiu isso",
    2 => "{$likes[0]} e {$likes[1]} curtiram isso",
    3 => "{$likes[0]}, {$likes[1]} e {$likes[2]} curtiram isso",
    default => "{$likes[0]}, {$likes[1]} e outras " . (count($likes) - 2) . " pessoas curtiram isso",
};