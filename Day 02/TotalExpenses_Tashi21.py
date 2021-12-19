"""
Total Expenses
"""

T = int(input())
for _ in range(T):
    quantity, price = map(int, input().split())
    if quantity > 1000:
        print(price*quantity*0.9)
    else:
        print(price*quantity)
