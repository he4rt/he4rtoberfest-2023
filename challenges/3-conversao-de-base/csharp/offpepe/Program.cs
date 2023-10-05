using System.Text;

var input = Console.ReadLine() ?? string.Empty;
Console.WriteLine(DecimalToBinary(input));
return;

static string DecimalToBinary(string input)
{
    var decNum = decimal.Parse(input);
    var intNum = (int) decNum;
    var numBinary = Convert.ToString(intNum, 2);
    var fraction = decNum - intNum;
    if (fraction == 0) return numBinary;
    var output = new StringBuilder(numBinary);
    output.Append('.');
    for (var i = 0; i < 20; i++)
    {
        fraction *= 2;
        var digit = (int) fraction;
        output.Append(digit);
        fraction -= digit;
        if (fraction <= 0) break;
    }   
    return output.ToString();
}