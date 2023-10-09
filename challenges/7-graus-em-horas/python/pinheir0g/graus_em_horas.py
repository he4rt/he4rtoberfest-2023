def graus_em_horas(graus):
    horas = int(graus / (360 / 12))
    minutos = int((graus / 360 * 12 - horas) * 60)

    horas_formatadas = f'{horas}:{minutos:02d}'

    return horas_formatadas

graus = int(input('Digite a angulação: '))
print(graus_em_horas(graus))