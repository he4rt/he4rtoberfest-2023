#include <stdio.h>
#include <stdlib.h>

int	main(int argc, char **argv)
{
	int	res = 1;
	if (argc != 2)
		return (1);
	for (int x = 0; x < 3; x++)
	{
		res = res * atoi(argv[1]);
	}
	printf("%d\n", res);
	return (0);
}
