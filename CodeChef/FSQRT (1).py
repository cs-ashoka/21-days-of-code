import math

T = int(input())

if T>20:
    print("Invalid input.")
else:
    for i in range(T):
        N = int(input())
        if N>10000:
            print("Invalid input.")
        else:
            print(round(math.sqrt(N)))