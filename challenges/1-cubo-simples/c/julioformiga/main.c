#include <math.h>
#include <stdio.h>
#include <stdlib.h>

int	main(int argc, char **argv) {
	double numero, power = 3;

	if (argc == 2)
		numero = atof(argv[1]);
	else
		scanf("%lf", &numero);
	printf("%d\n", (int)pow(numero, power));

	return (0);
}
