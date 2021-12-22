# Happy Number
# https://leetcode.com/problems/happy-number/

class Solution:
    def isHappy(self, n: int) -> bool:
        while True:
            n = sum(map(lambda x : int(x)**2, list(str(n))))
            if n == 1: return True
            if n == 145: return False