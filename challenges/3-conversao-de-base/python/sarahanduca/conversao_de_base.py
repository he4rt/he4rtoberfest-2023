import math 
def to_binary(decimal):
    binary = []
    binary_range = math.ceil(math.sqrt(decimal))
    for digit in range(binary_range):
        binary.append(decimal%2)

    return " ".join(str(e) for e in binary)

print(to_binary(27))
print(to_binary(64))
print(to_binary(16))
print(to_binary(2))
print(to_binary(7))