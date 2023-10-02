# Desafio #9

**Nome:** Likes

**Descrição**: Canhassi é um astro superstar de Hollywood e por isso quer criar sua própria rede social, claro, de forma eficiente, começando pelo menu inferior para mostrar a contagem de likes, porém, precisa da sua ajuda nessa tarefa. Basicamente a entrada sempre vai ser um array, isto é, um vetor ou lista (como preferir), contendo nomes de usuários que curtiram um post, dessa forma, podendo implementar para a rede social um funcionamento de apresentação de likes. Seu objetivo é criar um programa que faça a leitura de um array de nomes e retorne a contagem de likes de acordo com a quantidade de nomes.

Nesse desafio espera-se que você siga o [modelo de desafio](../README.org) e aplique-o corretamente. 

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
