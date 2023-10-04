string? input = Console.ReadLine().ToLower();

if(input != null)
{
    char[] palavra = input.ToCharArray();

    bool palindromo = true;

    for (int i = 0; i < palavra.Length / 2; i++)
    {
        if(palavra[i] != palavra[palavra.Length - 1 - i])
        {
            palindromo = false;
            break;
        }
    }

    Console.WriteLine(palindromo);
}
else
{
    Console.WriteLine("Input inválido.");
}