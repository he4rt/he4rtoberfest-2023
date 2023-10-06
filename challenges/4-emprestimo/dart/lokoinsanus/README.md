# Submissão de Exercicio

**Exercicio:** 0 - Hello World

**Nickname:** lokoinsanus

**Nível Técnico:** - Estudante

**Empresa:** - Nenhuma

**Twitter**: https://twitter.com/lokoinsanus

**Dificuldade de Resolução:** - Baixa

**Como rodar o desafio**: 

É necessário ter instalada a Dart SDK. Podendo seguir as orientações em https://dart.dev/get-dart

Para compilar o código use:
```bash
dart emprestimo.dart '1000.00, 10, 1'
```

É necessario que o argumento seja passado entre aspas e com espaço depois das virgulas

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
