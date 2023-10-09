def likes(lista_nomes):
    numero_likes = len(lista_nomes)
    if numero_likes == 0:
        return "Ninguém curtiu isso."
    elif numero_likes == 1:
        return f"{lista[0]} curtiu isso."
    elif numero_likes == 2:
        return f"{lista[0]} e {lista[1]} curtiram isso."
    elif numero_likes == 3:
        return f'{lista[0]}, {lista[1]} e {lista[2]} curtiram isso.'
    else:
       return f"{', '.join(lista[:2])} e outras {numero_likes - 2} pessoas curtiram isso"
    
lista = input('Digite uma lista de nomes: ').split(', ')

nomes = [nome for nome in lista if nome.strip()]

print(likes(nomes))