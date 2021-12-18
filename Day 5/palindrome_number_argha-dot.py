class Solution:
    def isPalindrome(self, x: int) -> bool:
        _str = str(x)
        rev_str = _str[::-1]
        
        if _str == rev_str:
            return True
        else:
            return False
        
        