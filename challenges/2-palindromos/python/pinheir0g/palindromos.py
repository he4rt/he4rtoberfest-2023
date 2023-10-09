def palindromos(palavra):
    if palavra == palavra[::-1]:
        return True
    return False

palavra = str(input('Digite uma palavra: ')).lower()
print(palindromos(palavra))
