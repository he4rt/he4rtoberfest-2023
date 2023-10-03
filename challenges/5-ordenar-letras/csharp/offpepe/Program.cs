var word = Console.ReadLine() ?? string.Empty;
Console.WriteLine(new string(word.OrderBy(c => c).ToArray()));