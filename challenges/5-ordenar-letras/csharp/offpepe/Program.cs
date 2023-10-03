var word = Console.ReadLine() ?? string.Empty;
word = new string(word.OrderBy(c => c).ToArray()); 
Console.WriteLine(word);