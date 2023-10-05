from sys import argv

numero = argv[1]

novo_numero = 0

if len(numero) > 1:
    numero = list(numero)
    numero.reverse()
    for i, num in enumerate(numero):
        try:
            if numero[i] < numero[i + 1]:
                numero[i] = numero[i + 1]
                numero[i + 1] = num
                
                numero.reverse()
                novo_numero = "".join(numero)
                break
        except:
            novo_numero = -1
else:
    novo_numero = -1

print(novo_numero)