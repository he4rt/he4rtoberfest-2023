
Console.Write("Digite o número que deseja elevador ao cubo: ");
double numero = double.Parse(Console.ReadLine());

double numeroAoCubo = Math.Pow(numero, 3);

Console.WriteLine();
Console.WriteLine($"O resultado de {numero} elevado ao cubo é igual a {numeroAoCubo}");


