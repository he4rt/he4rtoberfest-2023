import sys

palavra = sys.argv[1]

if palavra == palavra[::-1]:
    print(True)
else:
    print(False)