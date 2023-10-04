<?php
function numeroMenor($numero) {
    
    if (!is_int($numero)) {
        echo "O número precisa ser inteiro";
        return;
    }
    
    $numero = abs($numero);
    $numeroStr = strval($numero);
    $digitos = str_split($numeroStr);
    
    $indice = -1;
    for ($i = 0; $i < count($digitos) - 1; $i++) {
        if ($digitos[$i] > $digitos[$i + 1]) {
            $indice = $i;
            break;
        }
    }
    
    if ($indice == -1) {
        return -1;
    }
    
    $menorIndice = $indice + 1;
    for ($i = $indice + 2; $i < count($digitos); $i++) {
        if ($digitos[$i] < $digitos[$menorIndice] && $digitos[$i] > $digitos[$indice]) {
            $menorIndice = $i;
        }
    }
    
    
    $temp = $digitos[$indice];
    $digitos[$indice] = $digitos[$menorIndice];
    $digitos[$menorIndice] = $temp;
    
    
    $direita = array_slice($digitos, $indice + 1);
    sort($direita);
    
    
    $numeroFinalStr = implode("", array_merge(array_slice($digitos, 0, $indice + 1), $direita));
    
    if ($numeroFinalStr[0] == '0') {
        return -1;
    }
    
    return intval($numeroFinalStr);
}


echo numeroMenor(531);
echo numeroMenor(9);
echo numeroMenor(111);
echo numeroMenor(2071);
echo numeroMenor(3081);
