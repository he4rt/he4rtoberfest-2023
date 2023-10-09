def emprestimo(dados):
    valor_emprestimo = float(dados[0])
    taxa_juros = int(dados[1])
    tempo = int(dados[2])

    valor_final = valor_emprestimo * (1 + taxa_juros/100) ** tempo
    return f'{valor_final:.2f}'

print('Digite o valor do emprestimo, taxa de juros e o periodo de tempo:')
dados = input().split(',')
print(emprestimo(dados))