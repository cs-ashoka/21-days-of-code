def main():
    n = int(input())

    for _ in range(n):
        q, p = list(map(int, input().split()))
        if q > 1000:
            print(0.9 * q * p)
        else:
            print(q * p)


if __name__ == '__main__':
    main()