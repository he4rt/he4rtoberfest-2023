from sys import argv

palavra = argv[1].lower()

if palavra == palavra[::-1]:
    print(True)
else:
    print(False)

