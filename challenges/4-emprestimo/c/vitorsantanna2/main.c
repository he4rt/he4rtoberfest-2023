#include <stdio.h>
#include <stdlib.h>
#include <string.h>

double	power(double x, double y)
{
	double	res;

	res = 1;
	while (y > 0)
	{
		res *= x;
		y--;
	}
	return res;
}

int main(int argc, char **argv)
{
	float	value;
	int	juros;
	int	years;
	float	res;

	if (argc != 2)
		return 1;
	value = atof(strtok(argv[1], ", "));
	juros = atoi(strtok(NULL, ", "));
	years = atoi(strtok(NULL, ", "));
	res = value * power((1 + juros / 100.0), years);
	printf("%.2f\n", res);
    return 0;
}
