#include <stdio.h>

int main(int argc, char **argv) {
	if (argc >= 2)
		printf("%s\n", argv[1]);
	else
		printf("Nenhum argumento fornecido. Tente: ./a.out \"Hello World!\"\n");
	return 0;
}