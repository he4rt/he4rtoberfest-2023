main(List<String> args) {
  print(ordernar(args[0]));
}

ordernar(String word) {
  var splited = word.toLowerCase().split('');
  var aux;
  for (var i = 0; i < splited.length; i++) {
    for (var j = 0; j < splited.length; j++) {
      if (splited[j].codeUnitAt(0) > splited[i].codeUnitAt(0)) {
        aux = splited[j];
        splited[j] = splited[i];
        splited[i] = aux;
      }
    }
  }
  return splited.join('');
}
