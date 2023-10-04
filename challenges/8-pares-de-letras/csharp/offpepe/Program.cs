var input = Console.ReadLine() ?? string.Empty;
var halfSize = (int) Math.Ceiling(input.Length / 2m);
var pairVector = new List<string>(halfSize);
var chars = input.ToCharArray();
for (var i = 0; i < chars.Length; i+= 2)
{
    if (i + 1 >= chars.Length)
    {
        pairVector.Add(chars[^1] + "$");
        break;
    } 
    pairVector.Add($"{chars[i]}{chars[i+1]}");
}
Console.WriteLine($"[{string.Join(", ",pairVector)}]");
