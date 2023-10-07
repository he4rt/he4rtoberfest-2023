main(List<String> args) {
  print(convertBinary(int.parse(args[0])));
}

convertBinary(int number) {
  List<String> binary = [];
  do {
    binary.insert(0, (number % 2).toString());
    number ~/= 2;
  } while (number != 0);
  return binary.join('');
}
