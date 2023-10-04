from sys import argv

GRAUS_POR_HORA = 360 / 12
GRAUS_POR_MINUTO = GRAUS_POR_HORA / 60

hora_em_graus = int(argv[1])

hora  = hora_em_graus / GRAUS_POR_HORA

minutos = hora_em_graus % GRAUS_POR_HORA
minutos = minutos / GRAUS_POR_MINUTO

if minutos == 0:
    minutos = '00'

hora = str(hora).split('.')[0]
minuto = str(minutos).split('.')[0]

hora_padrao = hora + ":" + minuto

print(hora_padrao)
