def isHappy(n: int) -> bool:

    def get_next(n_arr) -> int:
        n_n = [int(x) for x in str(n_arr)]
        return sum([x**2 for x in n_n])
    
    prev = []
    num = n
    while num != 1 and num not in prev:
        prev.append(num)
        num = get_next(num)
        # print(num, prev)

    return num == 1 


if __name__ == "__main__":
    n = int(input())

    print(isHappy(n))