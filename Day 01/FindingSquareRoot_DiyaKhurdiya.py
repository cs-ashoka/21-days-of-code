import math
from array import *
T = int(input())
x = array('i',[])
if((T<=20) and (T>=1)):
    for i in range(T):
        i = int(input())
        x.append(int(math.sqrt(i)))
for i in x:
    print(i)    
