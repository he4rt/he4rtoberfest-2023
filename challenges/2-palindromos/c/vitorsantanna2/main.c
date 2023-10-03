#include <stdio.h>
#include <string.h>
#include <stdlib.h>

char to_lower(char c)
{
	if (c >= 'A' && c <= 'Z')
		return (c + 32);
	return (c);
}

char *ft_strdup(char *str)
{
	int i;
	char *dup;

	i = 0;
	while (str[i])
	{
		str[i] = to_lower(str[i]);
		i++;
	}
	dup = (char *)malloc(sizeof(char) * (i + 1));
	i = 0;
	while (str[i])
	{
		dup[i] = str[i];
		i++;
	}
	return (dup);
}

char *ft_strrev(char *str)
{
	int i;
	int j;
	char temp;

	i = 0;
	j = 0;
	while (str[i])
		i++;
	i--;
	while (i > j)
	{
		temp = str[i];
		str[i] = str[j];
		str[j] = temp;
		j++;
		i--;
	}
	return (str);
}

int	main(int argc, char **argv)
{
	char *reverse;
	if (argc != 2)
		return (0);
	reverse = ft_strrev(ft_strdup(argv[1]));
	if (strcmp(reverse, argv[1]) == 0)
		printf("true\n");
	else
		printf("false\n");
	free(reverse);
  return (1);
}
