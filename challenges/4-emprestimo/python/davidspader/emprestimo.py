from sys import argv

valores = argv[1].split(',')

valor_emprestimo = float(valores[0])
taxa_juros = int(valores[1])
tempo = int(valores[2])

valor_final = valor_emprestimo * (1 + taxa_juros/100)**tempo

print("{:.2f}".format(valor_final))