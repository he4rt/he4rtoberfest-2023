#include <stdio.h>
#include <string.h>

int main(void) {
	char palavra[13];
	char str[] = "Hello World!";

	printf("Digite: \"Hello World!\": ");
	fgets(palavra, sizeof(palavra), stdin);

	// Remove a quebra de linha ao pressionar enter
	palavra[strcspn(palavra, "\n")] = '\0';

	if (strcmp(palavra, str) == 0 || strcasecmp(palavra, str) == 0) {
		printf("%s\n", palavra);
	} else {
		printf("Argumento incorreto, escreva \"Hello World!\" sem as aspas duplas e respeitando o lower e upercase!\n");
		return 1;
	}
	return 0;
}
