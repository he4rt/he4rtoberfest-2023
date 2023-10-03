#include <unistd.h>

static void ft_putnbr(int n)
{
	char	c;

	if (n == -2147483648)
		write(1, "-2147483648", 11);
	else
	{
		if (n < 0)
		{
			write(1, "-", 1);
			ft_putnbr(-n);
		}
		else if (n > 9)
		{
			ft_putnbr(n / 10);
			ft_putnbr(n % 10);
		}
		else
		{
			c = n + '0';
			write(1, &c, 1);
		}
	}
}

static int	ft_atoi(char *n_str)
{
	int	number;
	int	sign;
	int	count;

	number = 0;
	sign = 1;
	count = 0;
	while ((n_str[count] >= 9 && n_str[count] <= 13) || (n_str[count] == 32))
		count++;
	if (n_str[count] == '-')
		sign = -1;
	if (n_str[count] == '-' || n_str[count] == '+')
		count++;
	while (n_str[count] >= '0' && n_str[count] <= '9')
		number = number * 10 + (n_str[count++] - '0');
	return (number * sign);
}

static int	ft_power(int n, int power)
{
	if (power < 0)
		return (0);
	if (power == 0)
		return (1);
	else
		return (n * ft_power(n, power - 1));
}

int main(int argc, char *argv[])
{
	int current_cube;
	int count;

	(void) argc;
	count = 0;
	while (argv[++count])
	{
		current_cube = ft_power(ft_atoi(argv[count]), 3);
		ft_putnbr(current_cube);
		write(1, "\n", 1);
	}
	return (0);
}
