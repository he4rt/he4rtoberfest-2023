# Submissão de Exercicio

**Exercicio:** 9 - Likes

**Nickname:** lokoinsanus

**Nível Técnico:** - Estudante

**Empresa:** - Nenhuma

**Twitter**: https://twitter.com/lokoinsanus

**Dificuldade de Resolução:** - Facil

**Como rodar o desafio**: 

É necessário ter o ambiente ter instalada a Dart SDK. Podendo seguir as orientações em https://dart.dev/get-dart

Para compilar o código use:
```bash
dart likes.dart "['Daniel']"
```

É necessario que o argumento seja passado entre aspas duplas ou simples, dependendo das aspas que forem ser passadas dentro

**Input/Args**: 
- []
- ['Daniel']
- ['Daniel', 'Guto']
- ['Daniel', 'Guto', 'Cherry']
- ['Daniel', 'Guto', 'Cherry', 'Marlon']

**Output**:

```
"Ninguém curtiu isso"
```

```
"Daniel curtiu isso"
```

```
"Daniel e Guto curtiram isso"
```

```
"Daniel, Guto e Cherry curtiram isso"
```

```
"Daniel, Guto e outras 2 pessoas curtiram isso"
```
> Conforme o número de pessoas que curtiram o post aumentar, o texto deve mudar para se adequar, alterando o número que no exemplo acima é 2.
