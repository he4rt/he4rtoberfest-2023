def NumeroMenor(number):
    digits = [int(i) for i in str(number)]

    x = -1
    for i in range(len(digits) - 2, -1, -1):
        if digits[i] > digits[i + 1]:
            x = i
            break
    
    if x == -1: return -1

    y = -1
    for i in range(len(digits) - 1, x, -1):
        if digits[i] < digits[x]:
            y = i
            break
    
    digits[x], digits[y] = digits[y], digits[x]
    x, y = y, x

    digits[y+1::] = sorted(digits[y+1::], reverse=True)

    if digits[0] == 0: return -1

    return int(''.join([str(i) for i in digits]))


if __name__ == "__main__":
    import sys
    number = sys.argv[1]
    print(NumeroMenor(number))