import sys

numero_dec = int(sys.argv[1])
numero_bin = bin(numero_dec)[2::]

print(numero_bin)