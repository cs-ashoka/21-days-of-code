class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x < 0: return False
        
        xstr = str(x)
        return xstr == xstr[::-1]        
        