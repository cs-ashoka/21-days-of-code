# cook your dish here
T = int(input())
q = []
p = []

for i in range(0,T):
    qp = input()
    quantityprice = qp.split()
    q.append(int(quantityprice[0]))
    p.append(int(quantityprice[1]))
    
case = 0
while case<len(q):
    expense = q[case]*p[case]
    if q[case] <1000:
        print(expense)
    else:
        print(expense*0.9)
    
    case +=1