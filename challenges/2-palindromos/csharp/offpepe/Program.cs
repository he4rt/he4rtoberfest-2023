string? word = Console.ReadLine();

if (string.IsNullOrEmpty(word)) throw new ArgumentException("input is required!");
word = word.ToLower();
string reversedWord = string.Create(word.Length, word, (c, s) => {
    s.CopyTo(c);
    c.Reverse();
});

Console.WriteLine(word == reversedWord);