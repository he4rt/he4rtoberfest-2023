from sys import argv

palavra = argv[1]

letras = list(palavra)

if len(letras) % 2 != 0:
    letras.append('$')

output = []

for i, letra in enumerate(letras):
    if i % 2 == 0:
        par = letra + letras[i + 1]
        output.append(par)

print(output)