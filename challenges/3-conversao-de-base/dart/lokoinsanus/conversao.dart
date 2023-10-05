main(List<String> args) {
  print(convertBinary(int.parse(args[0])));
}

convertBinary(int number) {
  List<String> binary = [];
  while (number != 0) {
    binary.insert(0, (number % 2).toString());
    number ~/= 2;
  }
  return binary.join('');
}
