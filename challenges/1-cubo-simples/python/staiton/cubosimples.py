def calcular_cubo(numero):
    return numero ** 3

# Solicita a entrada do usuário
numero = float(input("Digite um número: "))

# Chama a função para calcular o cubo
resultado = calcular_cubo(numero)

# Imprime o resultado
print(f"O cubo de {numero} é {resultado}")
