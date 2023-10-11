main(List<String> args) {
  String argsString = args[0].substring(1, args[0].length - 1);
  List<String> argsList = argsString
      .split(', ')
      .map((element) => element.replaceAll("'", ''))
      .toList();
  print(likes(argsList));
}

likes(List<String> cont) {
  var length = cont.length;
  if (cont[0] == '') {
    return "Ninguém curtiu isso";
  } else if (length == 1) {
    return "${cont[0]} curtiu isso";
  } else if (length == 2) {
    return "${cont[0]} e ${cont[1]} curtiram isso";
  } else if (length == 3) {
    return "${cont[0]}, ${cont[1]} e ${cont[2]} curtiram isso";
  }
  return "${cont[0]}, ${cont[1]} e ${length - 2} pessoas curtiram isso";
}
