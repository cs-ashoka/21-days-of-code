# cook your dish here
try:
    t = int(input())
    for _ in range(t):
        qnt, price = input().split(' ')
        qnt, price = int(qnt), int(price)
        res = qnt * price if qnt < 1000 else 0.9 * qnt * price
        print(res)

except:
    pass
