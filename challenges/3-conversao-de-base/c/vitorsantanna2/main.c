#include <stdio.h>
#include <stdlib.h>

int	decimal_to_binary(int n)
{
	int	remainder;
	int	binary;
	int	i;

	i = 1;
	binary = 0;
	while (n != 0)
	{
		remainder = n % 2;
		n /= 2;
		binary += remainder * i;
		i *= 10;
	}
	return (binary);
}

int	main(int argc, char **argv)
{
	if (argc != 2)
		return (0);
	printf("%d\n", decimal_to_binary(atoi(argv[1])));
	return (0);
}
