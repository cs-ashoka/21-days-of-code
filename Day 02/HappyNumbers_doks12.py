class Solution:
    def isHappy(self, n: int) -> bool:
        while n!= 1:
            digits = list(map(int,(list(str(n)))))
            n = sum(list(map(lambda x: x ** 2, digits)))
            if n<9 and n not in [1,7]:
                return False
            else:
                pass
        return True
            