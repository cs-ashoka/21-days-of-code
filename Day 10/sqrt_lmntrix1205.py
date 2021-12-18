T = int(input())
if T >= 1 and T <= 20:
    while T > 0:
        N = int(input())
        if N >= 1 and N <= 10000: 
            sqrt = (N ** 0.5)
            print(round(sqrt))
            T -= 1
        else: 
            continue
else:
    quit()
    