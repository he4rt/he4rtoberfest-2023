main(List<String> args) {
  var (hora, minuto) = grausParaHoras(int.parse(args[0]));
  print("$hora:${minuto.toString().padLeft(2, '0')}");
}

(int, int) grausParaHoras(int number) {
  var hora = number * 12 ~/ 360;
  var minuto = number * 12 % 360 ~/ 6;
  return (hora, minuto);
}
