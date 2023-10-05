def to_the_cube(x:int, power = 3):
    if(power == 0):
        return 1
    return to_the_cube(x, power-1) * x

n = int(input("Digite um número: \n"))
print(to_the_cube(n))