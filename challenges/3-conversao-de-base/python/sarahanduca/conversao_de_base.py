import sys
def to_binary(decimal):
    binary = []
    while(decimal > 1):
        binary.append(decimal % 2)
        decimal = decimal // 2
    binary.append(decimal)
    binary.reverse()
    return " ".join(str(e) for e in binary)

num = int(sys.argv[1])
print(to_binary(num))