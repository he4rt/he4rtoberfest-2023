var input = Console.ReadLine();
var isValid = decimal.TryParse(input, out var degrees);
if (!isValid) throw new ArgumentException("Invalid input");
var hours = (int) degrees / 30;
var rest = degrees % 30;
var minutes = (int) rest / 0.5;
Console.WriteLine($"{hours}:{minutes:00}");
