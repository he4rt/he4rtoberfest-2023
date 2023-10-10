string numEmBinarioInvertido = "";


Console.WriteLine("Digite um número decimal e descubra seu correspondente em binário!!");

Console.Write("\nDigite o número: ");
_ = int.TryParse(Console.ReadLine(), out int numEmDecimal);


int contador;

while (numEmDecimal >= 1)
{
    contador = numEmDecimal % 2;
    numEmBinarioInvertido += contador;
    numEmDecimal /= 2;
}
char[] numEmBinarioCorrigido = numEmBinarioInvertido.ToCharArray();

Array.Reverse(numEmBinarioCorrigido);


Console.WriteLine(numEmBinarioCorrigido);