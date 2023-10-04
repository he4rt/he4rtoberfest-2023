from sys import argv

numero = int(argv[1])
total_divisao = 0

for i in range(1, numero + 1):
    if(numero % i == 0):
        total_divisao += 1

if total_divisao == 2:
    print(True)
else:
    print(False)