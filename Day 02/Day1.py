import math

def find_square_root(N):
    [print(math.floor(math.sqrt(i))) for i in N]


N = list(map(int, input("Enter multiple values: ").split()))
find_square_root(N[1:])