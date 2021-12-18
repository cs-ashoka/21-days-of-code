def sq(l):
    print("INPUT:")
    for i in l:
        print(i)

    print()
    print("OUTPUT:")
    for j in range(1, len(l)):
        x = l[j]
        sqr = x**(1/2)
        sqr = int(sqr)
        
        print(sqr)



l = []
t = int(input("How many numbers do you want to enter : "))
l.append(t)

for i in range(t):
    n = int(input("Enter a number between 1-10000 : "))

    if n<1 or n>10000:
        print("Enter a valid number!")
        break

    l.append(n)

sq(l)