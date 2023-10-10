string palavra;

do
{
    Console.Clear();
    Console.Write("Digite uma palavra/número para saber se é palíndromo: ");
    palavra = Console.ReadLine().Trim().ToLower().Replace(" ", "");
}while(palavra.Length <= 1);

string palavraInvertida = new (palavra.Reverse().ToArray());

bool palindromo = palavra == palavraInvertida;

Console.WriteLine($"\n{palindromo}");
