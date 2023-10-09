def numeros_primos(numero):
    divisao = 0
    for i in range(1, numero + 1):
        if numero % i == 0:
            divisao += 1

    if divisao == 2:
        return True
    else:
        return False
        
numero = int(input('Digite um número: '))
print(numeros_primos(numero))
