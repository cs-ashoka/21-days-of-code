import math

T = int(input())
if 1 <= T <= 20:
    for i in range(T):
        N = int(input())
        if 1<= N <= 10000:
            print(round(math.sqrt(N)))

            
    