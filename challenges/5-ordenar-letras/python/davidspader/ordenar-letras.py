from sys import argv

palavra = list(argv[1])
palavra.sort()

nova_palavra = ''.join(palavra)

print(nova_palavra)