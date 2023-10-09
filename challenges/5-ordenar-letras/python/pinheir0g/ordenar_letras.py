def ordenar_letras(palavra):
    palavra.sort()
    palavra_ordenada = ''.join(palavra)

    return palavra_ordenada

palavra = list(input('Digite uma palavra: '))
print(ordenar_letras(palavra))
