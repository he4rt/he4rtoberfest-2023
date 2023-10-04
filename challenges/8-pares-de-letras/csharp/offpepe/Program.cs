var input = Console.ReadLine() ?? string.Empty;
var halfSize = (int) Math.Ceiling(input.Length / 2m);
var pairVector = new List<string>(halfSize);
for (var i = 0; i < input.Length; i+= 2)
{
    if (i + 1 >= input.Length)
    {
        pairVector.Add(input[^1] + "$");
        break;
    } 
    pairVector.Add($"{input[i]}{input[i+1]}");
}
Console.WriteLine($"[{string.Join(", ",pairVector)}]");
