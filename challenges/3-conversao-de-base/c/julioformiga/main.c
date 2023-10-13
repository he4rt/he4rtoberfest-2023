#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>

int	check_base(char *base) {
	int	i;
	int	j;

	if (!base || base[0] == '\0' || base[1] == '\0')
		return (0);
	i = -1;
	while (i++, base[i] != '\0')
	{
		if (base[i] == '+' || base[i] == '-')
			return (0);
		j = i;
		while (j++, base[j] != '\0')
			if (base[i] == base[j])
				return (0);
	}
	return (1);
}

void	convert_base(int nbr, char *base) {
	int		base_len;
	char	digit;

	if (!check_base(base))
		return ;
	if (nbr < 0) {
		write(1, "-", 1);
		nbr = -nbr;
	}
	base_len = 0;
	while (base[base_len] != '\0')
		base_len++;
	if (nbr >= base_len)
		convert_base(nbr / base_len, base);
	digit = base[nbr % base_len];
	write(1, &digit, 1);
}

int	main(int argc, char **argv) {
	int numero;

	if (argc == 2)
		numero = atoi(argv[1]);
	else
		scanf("%d", &numero);
	convert_base(numero, "01");
	write(1, "\n", 1);

	return (0);
}
