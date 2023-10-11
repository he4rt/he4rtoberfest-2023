function calcularValorFinal(entrada: string): number {
  const [valor, taxa, tempo] = entrada.split(', ');
  const emprestimo = parseFloat(valor);
  const juros = parseFloat(taxa) / 100;
  const tempoEmAnos = parseInt(tempo);
  const valor_final = emprestimo * Math.pow(1 + juros, tempoEmAnos);

  return parseFloat(valor_final.toFixed(2));
}



