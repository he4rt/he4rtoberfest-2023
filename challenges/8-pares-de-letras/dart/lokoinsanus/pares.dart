main(List<String> args) {
  print(pares(args[0]));
}

pares(String word) {
  List<String> pares = [];
  for (var i = 1; i < word.length; i += 2) {
    pares.add(word[i - 1] + word[i]);
  }
  if (word.length % 2 != 0) {
    pares.add(word[word.length - 1] + '\$');
  }
  return pares;
}
