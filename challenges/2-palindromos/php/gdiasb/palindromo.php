<?php
function palindrome(string $word) : string
{
    if (strrev(strtolower($word)) == strtolower($word)) 
    {
        return 'true';
    } else
    {
        return 'false';
    };
};


echo palindrome($argv[1]) . PHP_EOL;