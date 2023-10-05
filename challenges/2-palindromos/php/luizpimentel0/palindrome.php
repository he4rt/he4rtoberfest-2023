<?php

function palindrome(string $word) :string {
	$reversedWord = strrev($word);

	if (strtolower($reversedWord) !== strtolower($word)) {
		return 'false';
	}
	return 'true';
}

echo(palindrome($argv[1]));