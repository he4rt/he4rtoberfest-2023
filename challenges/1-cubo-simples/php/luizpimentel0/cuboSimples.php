<?php

for ($i=1; $i < count($argv); $i++) {
  try {
    echo pow($argv[$i], 3) . PHP_EOL;
  } catch (\Throwable $th) {
    echo "Operação não suportada.   Parâmetro {$argv[$i]} é inválido.";
  } 
}