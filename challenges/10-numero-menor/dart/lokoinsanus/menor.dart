main(List<String> args) {
  print(menor(int.parse(args[0])));
}

menor(int number) {
  List<int> listNumber = number.toString().split('').map(int.parse).toList();
  List<int> iListNumber;
  listNumber.sort();
  for (var i = number - 1; i > 0; i--) {
    iListNumber = i.toString().split('').map(int.parse).toList();
    iListNumber.sort();
    if (listNumber.join('') == iListNumber.join('')) {
      return i;
    }
  }
  return -1;
}
