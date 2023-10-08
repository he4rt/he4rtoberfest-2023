#include <stdio.h>
#include <stdlib.h>

int	g_max_sqrt = 46340;

int	is_prime(int nb)
{
	int	i;

	if (nb == 2)
		return (1);
	if (nb % 2 == 0 || nb <= 1)
		return (0);
	i = 3;
	while (i < nb / 2 && i < g_max_sqrt)
	{
		if (nb % i == 0)
			return (0);
		i += 2;
	}
	return (1);
}

int	main(int argc, char **argv) {
	int numero;

	if (argc == 2)
		numero = atoi(argv[1]);
	else {
		printf("Informe um número: ");
		scanf("%d", &numero);
	}

	if(is_prime(numero))
		printf("true");
	else
		printf("false");

	return (0);
}
