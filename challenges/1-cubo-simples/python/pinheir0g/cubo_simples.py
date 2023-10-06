def cubo_simples():
    numero = int(input("Digite um número: "))
    if numero == 0:
        return 1
    return f'O número {numero} elevado ao cubo é igual a {numero**3}'

print(cubo_simples())