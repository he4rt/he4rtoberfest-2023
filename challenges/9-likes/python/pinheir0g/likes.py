from sys import argv

def likes(lista_nomes):
    numero_likes = len(lista_nomes)
    if numero_likes <= 0:
        return "Ninguém curtiu isso."
    elif numero_likes == 1:
        return f"{lista_nomes[0]} curtiu isso."
    elif numero_likes == 2:
        return f"{lista_nomes[0]} e {lista_nomes[1]} curtiram isso."
    elif numero_likes == 3:
        return f'{lista_nomes[0]}, {lista_nomes[1]} e {lista_nomes[2]} curtiram isso.'
    else:
       return f"{lista_nomes[0]}, {lista_nomes[1]} e outras {numero_likes - 2} pessoas curtiram isso"
    
nomes = argv[1:]
    
print(likes(nomes))