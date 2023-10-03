<?php
function palindrome(string $word) : string
{
    if (strrev($word) == $word) 
    {
        return 'true';
    } else
    {
        return 'false';
    };
};


echo palindrome($argv[0]) . PHP_EOL;
