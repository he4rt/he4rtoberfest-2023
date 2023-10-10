#include <stdio.h>
#include <string.h>

char	*strtolower(char *str)
{
	str--;
	while (str++, *str != '\0')
		if (*str >= 'A' && *str <= 'Z')
			*str += 32;
	return (str);
}

int	is_palindromo(char *word) {
	char	drow[100];
	int		count, i;

	i = 0;
	strtolower(word);
	count = strlen(word);
	while (count--, count >= 0)
		drow[i++] = word[count];
	return (strcmp(word, drow));
}

int	main(int argc, char **argv) {
	char word[100];

	if (argc == 2)
		strcpy(word, argv[1]);
	else
		scanf("%s", word);
	if(!is_palindromo(word))
		printf("true\n");
	else
		printf("false\n");
	return (0);
}
