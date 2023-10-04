using System.Globalization;


var input = Console.ReadLine();
if (string.IsNullOrEmpty(input)) throw new ArgumentException("Invalid input.");
var splitted = input.Split(',');
var loanValue = decimal.Parse(splitted[0], CultureInfo.InvariantCulture);
var taxValue = double.Parse(splitted[1]) / 100;
var time = int.Parse(splitted[2]);

Console.WriteLine(loanValue * (decimal) Math.Pow(1 + taxValue, time));