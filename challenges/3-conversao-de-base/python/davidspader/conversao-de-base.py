from sys import argv

numero = int(argv[1])
numero_binario = bin(numero)[2::]

print(numero_binario)