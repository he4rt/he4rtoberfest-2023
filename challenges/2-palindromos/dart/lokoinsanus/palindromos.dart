main(List<String> args) {
  print(invert(args[0]));
}

invert(String word) {
  List<String> inverse = [];
  word = word.toUpperCase();
  for (var i = word.length - 1; i >= 0; i--) {
    inverse.add(word[i]);
  }
  return inverse.join('') == word ? true : false;
}
