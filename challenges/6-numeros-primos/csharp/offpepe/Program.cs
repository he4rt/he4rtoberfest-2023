var input = Console.ReadLine();
var valid = int.TryParse(input, out var num);
if (!valid) throw new ArgumentException("Invalid input");
Console.WriteLine(IsPrime(num));
return;


bool IsPrime(int num)
{
    if (num < 0) return false;
    if (num <= 2) return true;
    for (var i = 2; i < num; i++)
    {
        if (num % i == 0) return false;
    }

    return true;
}