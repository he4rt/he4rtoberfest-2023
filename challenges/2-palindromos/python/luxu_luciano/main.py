def palindromo(palavra):
    # Esse código: 'palavra[s] for s in range(len(palavra)-1, -1, -1)' Primeiro inverte a palavra ['s', 'o', 'c', 'o', 'r', 'r', 'a', 'm']
    # Esse código: '"".join()' junta o invertido: 'socorram'
    # e por fim esse código: '== palavra' compara as duas strings e retorna TRUE ou FALSE
    return "".join(palavra[s] for s in range(len(palavra) - 1, -1, -1)) == palavra

if __name__ == '__main__':
    palavras = ['arara', 'maracatu', 'osso', 'caracara', 'ala' ]
    print(
        f"São PALINDROMOS as seguintes palavras: {[palavra for palavra in palavras if palindromo(palavra)]}\n"
        f"já esses outras não são PALINDROMOS: {[palavra for palavra in palavras if not palindromo(palavra)]}"
    )
