# Desafio #4

**Nome:** Empréstimo

**Descrição**: Keit está em dúvida de qual carro comprar (mesmo que fosse sugerido a compra de uma Kombi), porque muitas das vezes o financiamento pode ser um problema ao pagar o valor final de seu veículo. Ela é cliente fiel de um banco chamado **Traeh** e quer saber o valor final de empréstimo caso realize neste banco. Seu objetivo é criar um programa para calcular o valor de empréstimo, ajudando Keit a calcular o valor a ser pago com juros em determinado período de tempo em anos, facilitando sua compra. Para realizar o cáculo você deverá implementar a fórmula de cálculo de juros abaixo:

```
valor_final = valor_emprestimo * (1 + taxa_juros)^tempo
```
- valor_final: Valor final a ser pago
- valor_emprestimo: Valor inicial do empréstimo
- taxa_juros: Juros a ser aplicado
- tempo: Tempo em anos
  
Deve ser enviado como entrada os seguintes dados na determinada ordem:
- Valor do empréstimo: Tipo ponto flutuante
- Taxa de juros: Inteiro (em porcentagem, por isso, deve-se dividir por 100)
- Tempo em anos: Inteiro

Retorno é ponto flutuante com duas casas decimais.

Obs.: Se preocupe apenas para receber os valores e retornar o valor final. Não é necessário validar se os valores são válidos ou não. Além disso, não se preocupe com os nomes das variáveis, você pode utilizar o nome que achar melhor.

Nesse desafio espera-se que você siga o [modelo de desafio](../README.org) e aplique-o corretamente. 

**Input/Args**: 
- 1000.00, 10, 1
> O cálculo seria feito da seguinte forma: 1000.00 * (1 + (10/100))^1 = 1100.00
- 5000.00, 5, 10
> O cálculo seria feito da seguinte forma: 5000.00 * (1 + (5/100))^10 = 8144.47
- 2500.00, 2, 5
> O cálculo seria feito da seguinte forma: 2500.00 * (1 + (2/100))^5 = 2760.20

Atenção: sim, o input deve ser feito apenas uma vez com vírgulas, no qual você deverá parsear a entrada!

**Output**:

```
1100.00
```

```
8144.47
```

```
2760.20
```
