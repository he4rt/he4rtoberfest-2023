main(List<String> args) {
  print(primo(int.parse(args[0])));
}

primo(int number) {
  if (number > 1) {
    for (var i = 2; i < number; i++) {
      if (number % i == 0) {
        return false;
      }
    }
  }
  return true;
}
