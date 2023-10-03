#include <unistd.h>

void ft_putchar(char ch){
	write(1, &ch, 1);
}

void ft_putstr(char *str){
	while(*str){
		ft_putchar(*str);
		str++;
	}
}

int main(int argc, char **argv) {
	if (argc >= 2)
	   ft_putstr(argv[1]);
	else
		ft_putstr("Nenhum argumento fornecido. Tente: ./a.out \"Hello World!\"\n");
	return 0;
}
