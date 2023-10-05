var input = Console.ReadLine();
var isValid = int.TryParse(input, out var num);
if (!isValid || num <= 10)
{
    Console.WriteLine(-1);
    return;
}

var numStr = num.ToString();
if (numStr.Distinct().Count() == 1)
{
    Console.WriteLine(-1);
    return;
}
for (var i = num - 1; i > 10; i--)
{
    var numStrCopy = new string(numStr);
    foreach (var c in i.ToString())
    {
        if (!numStrCopy.Contains(c))
        {
            break;
        }
        numStrCopy = numStrCopy.Replace(c.ToString(), string.Empty);
    }

    if (string.IsNullOrEmpty(numStrCopy))
    {
        Console.WriteLine(i);
        break;
    }
}
