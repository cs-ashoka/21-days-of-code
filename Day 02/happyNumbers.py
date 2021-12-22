class Solution:
    def isHappy(self, n: int) -> bool:
        # recursive solution
        def check(n):
            if n == 1:
                return True

            if n == 4:
                return False
            
            s = sum(int(i) ** 2 for i in str(n))
            return check(s)
        
        return check(n)
    
