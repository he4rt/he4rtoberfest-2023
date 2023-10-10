def pares_de_letras(string):
    pares = []
    palavra = list(string)

    if len(palavra) % 2 != 0:
        palavra.append('$')

    for i, letra in enumerate(palavra):
        if i % 2 == 0:
            pares.append(letra+palavra[i+1])

    return pares

string = str(input('Digite uma palavra: '))
print(pares_de_letras(string))
