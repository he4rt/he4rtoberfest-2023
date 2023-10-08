#include <stdio.h>
#include <stdlib.h>
#include <string.h>

char	*strtolower(char *str)
{
	str--;
	while (str++, *str != '\0')
		if (*str >= 'A' && *str <= 'Z')
			*str += 32;
	return (str);
}

char	*sort_word(char *word) {
	char	swap;
	int		i, j;

	strtolower(word);
	i = 0;
	while(i++, word[i] != 0) {
		j = 0;
		while(j++, word[j] != 0) {
			if (word[j - 1] > word[j]) {
				swap = word[j];
				word[j] = word[j - 1];
				word[j - 1] = swap;
			}
		}
	}
	return (word);
}

int	main(int argc, char **argv) {
	char	word[100];

	if (argc == 2) {
		strcpy(word, argv[1]);
	}
	else {
		printf("Informe a palavra que deseja ordenar: ");
		scanf("%s", word);
	}

	printf("%s\n", sort_word(word));

	return (0);
}
