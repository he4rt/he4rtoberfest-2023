#include <stdlib.h>
#include <unistd.h>

static int ft_strlen(char *str)
{
	int len;

	len = 0;
	while (str[len])
	{
		len++;
	}
	return(len);
}

static char *ft_strrev(char *str)
{
	int count;
	int len;
	char *rev;

	count = 0;
	len = ft_strlen(str);
	rev = (char *) malloc (sizeof(char) * len + 1);
	while (str[count])
	{
		rev[len - 1 - count] = str[count];
		count++;
	}
	rev[len - 1 - count] = '\0';
	return (rev);
}

static void ft_tolower(char *str)
{
	while (*str)
	{
		if (*str >= 'A' && *str <= 'Z')
		{
			*str += 32;
		}
		str++;
	}
}

static int ft_strequal(char *s1, char *s2)
{
	int count;

	count = 0;
	while (s1[count] && s2[count])
	{
		if (s1[count] != s2[count])
		{
			return (0);
		}
		count++;
	}
	return (1);
}

int main(int argc, char *argv[])
{
	(void) argc;
	int count;
	char *rev;

	count = 1;
	while (argv[count])
	{
		ft_tolower(argv[count]);
		rev = ft_strrev(argv[count]);
		if ((ft_strequal(argv[count], rev)))
		{
			write(1, "true\n", 6);
		}
		else 
		{
			write(1, "false\n", 6);
		}
		count++;
		free (rev);
	}
}
