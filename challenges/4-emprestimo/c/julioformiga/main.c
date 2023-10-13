#include <stdio.h>
#include <stdlib.h>
#include <string.h>

double	power(double nb, double nbpower) {
	if (nbpower < 0)
		return (0);
	if (nb == 0 && nbpower == 0)
		return (1);
	if (nbpower == 1)
		return (nb);
	return (nb * power(nb, nbpower - 1));
}

int	main(int argc, char **argv) {
	int		taxa_juros;
	int		anos;
	float	valor_final;
	float	valor_emprestimo;
	char	*token;

	if (argc == 2) {
		token = strtok(argv[1], ",");
		valor_emprestimo = atof(token);
		taxa_juros = atoi(strtok(NULL, ","));
		anos = atoi(strtok(NULL, ","));
	}
	else if(argc == 4) {
		valor_emprestimo = atof(argv[1]);
		taxa_juros = atoi(argv[2]);
		anos = atoi(argv[3]);
	}
	else {
		printf("Informe o valor do empréstimo: ");
		scanf("%f", &valor_emprestimo);
		printf("Informe o valor dos juros: ");
		scanf("%d", &taxa_juros);
		printf("Informe o tempo em anos: ");
		scanf("%d", &anos);
	}

	valor_final = valor_emprestimo * power(1 + (taxa_juros / 100.0), anos);
	printf("%.2f\n", valor_final);

	return (0);
}
