# FLOW009 https://www.codechef.com/submit/FLOW009

T = int(input())

for _ in range(T):
    Q, P = map(float, input().split())
    
    if Q > 1000:
        Q = 0.9 * Q
        
    print(Q*P)