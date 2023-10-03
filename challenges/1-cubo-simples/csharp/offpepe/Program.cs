string? sNum = Console.ReadLine();
if (string.IsNullOrEmpty(sNum)) throw new ArgumentException("Number is null or empty");
bool isValid = int.TryParse(sNum, out int num);
if (!isValid) throw new ArgumentException("Invalid number");
Console.WriteLine(Math.Pow(num, 3));