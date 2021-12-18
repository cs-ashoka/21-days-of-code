class Solution:
    def isPalindrome(self, x: int) -> bool:
        x = str(x)
        if list(x[::1]) == list(x[::-1]):
            return True
        else:
            return False
