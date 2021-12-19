"""
Happy Number
"""


class Solution(object):
    def isHappy(self, n):
        """
        :type n: int
        :rtype: bool
        """
        sums = 0
        previous_sums = []
        while True:
            while n > 0:
                sums += (n % 10)**2
                n = n//10
            if sums in previous_sums:
                return False
            if sums == 1:
                return True
            previous_sums.append(sums)
            n = sums
            sums = 0
