const string EMPTY_ARRAY = "[]";
var input = Console.ReadLine() ?? EMPTY_ARRAY;
if (input == EMPTY_ARRAY)
{
    Console.WriteLine("Ninguém curtiu isso");
    return;
}
var arr = input[1..^1]
    .Replace(((char) 39).ToString(), string.Empty)
    .Replace(" ", string.Empty)
    .Split(',');

Console.WriteLine(arr.Length switch
{
    1 => $"{arr[0]} curtiu isso",
    <= 3 => $"{string.Join(", ", arr.SkipLast(1))} e {arr[^1]} curtiram isso",
    _ => $"{string.Join(", ", arr[..2])} e outras {arr[2..].Length} pessoas curtiram isso"
});
