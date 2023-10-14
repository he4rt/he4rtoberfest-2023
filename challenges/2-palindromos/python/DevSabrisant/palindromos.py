import sys 

nome = sys.argv[1]
if nome == nome[::-1]:
    print(True)
else:
     print(False)
