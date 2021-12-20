# https://www.codechef.com/problems/FSQRT
# Given an integer n, find the largest integer x such that x^2 < n
# Use newton's method

def newton_sqrt(n):
    # next term of the newton's approximation
    def next_newton_sqrt(x):
        return (x + n // x) // 2
    
    # initialize the algorithm
    x, y = n, next_newton_sqrt(n)
    
    # approaching the sqrt from the RHS
    while y < x: 
        x, y = y, next_newton_sqrt(y)
        
    return x
    
T = int(input())
Print = [print(newton_sqrt(int(input()))) for _ in range(T)]