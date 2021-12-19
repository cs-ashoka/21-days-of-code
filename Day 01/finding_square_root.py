# cook your dish here
import math
try:
    p = int(input())

    nums = []
    for _ in range(p):
        n = int(input())
        nums.append(n)
    sq_nums = [math.sqrt(i) for i in nums]
    
    # math.floor(math.sqrt(i))
    for i in sq_nums:
        print(i)
    
except:
    pass