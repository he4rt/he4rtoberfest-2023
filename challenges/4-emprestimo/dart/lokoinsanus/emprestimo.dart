import 'dart:math';

main(List<String> args) {
  var valor, taxa, tempo;
  List<String> argumentos = args[0].split(', ');
  valor = argumentos[0];
  taxa = argumentos[1];
  tempo = argumentos[2];
  print((emprestimo(double.parse(valor), double.parse(taxa), int.parse(tempo)))
      .toStringAsFixed(2));
}

Function emprestimo =
    (num valor, num taxa, int tempo) => valor * (pow(1 + (taxa / 100), tempo));
