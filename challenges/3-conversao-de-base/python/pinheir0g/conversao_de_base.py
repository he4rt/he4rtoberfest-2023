def conversao_de_base(numero_dec):
    numero_bin = bin(numero_dec)[2:]
    return f'Número {numero_dec} convertido para base binária é igual {numero_bin}'

numero_dec = int(input('Digite um número: '))
print(conversao_de_base(numero_dec))
