def numero_menor(numero):
    if numero > 1:
        numeros = [int(d) for d in str(numero)]
        reverse = -1
        
        for i in range(len(numeros) - 1):
                if numeros[i] > numeros[i + 1]:
                    reverse = i
                    break

        if reverse == -1:
             return -1
        
        if all(numeros[i] == numeros[reverse + 1] for i in range(reverse + 1, len(numeros))):
            return -1
        
        numeros[reverse + 1:] = reversed(numeros[reverse + 1:])
        numeros[reverse + 1:] = sorted(numeros[reverse + 1:])
        
        numero_novo = int(''.join(map(str, numeros)))

        return numero_novo
    else:
        return -1
    

numero = int(input('Digite um número: '))
print(numero_menor(numero))