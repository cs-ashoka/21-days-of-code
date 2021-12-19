# https://leetcode.com/problems/palindrome-number/
# find whether a number/string is a palindrome

def is_palindrome(S) -> bool:
    S = str(S)
    u, v = 0, len(S) - 1
    while u <= v:
        if S[u] != S[v]:
            return False

        u = u + 1
        v = v - 1

    return True

S = input()
print(is_palindrome(S))
