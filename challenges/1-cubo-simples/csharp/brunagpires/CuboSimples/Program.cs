int CalculaCubo()
{
    string? input = Console.ReadLine();
    if(string.IsNullOrEmpty(input))
    {
        throw new Exception("Entrada invalida.");
    }
    int.TryParse(input, out int numero);
    return numero * numero * numero;
    
}

Console.WriteLine(CalculaCubo());