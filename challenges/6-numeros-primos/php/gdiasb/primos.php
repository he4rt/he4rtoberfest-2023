<?php

function primo(int $num)
{
    if ($num == 1 || $num <= 0)
    {
        return 'false';
    } elseif ($num == 2)
    {
        return 'true';
    } 
    for ($i = 2; $i <= $num; $i++)
    {
        if ($num % $i == 0) 
        {
            return 'false';
        } else
        {
            return 'true';
        }
    }

};

echo primo($argv[1]) . PHP_EOL;