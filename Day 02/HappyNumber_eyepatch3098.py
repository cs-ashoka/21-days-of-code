class Solution:
    def isHappy(self, n: int) -> str:
        
        def get_sum(n):
            sumofdigits = 0
            
            n = str(n)
            for i in n:
                sumofdigits += int(i)**2
            
            return sumofdigits
    
        seen = set()
        while n != 1 and n not in seen:
            seen.add(n)
            n = get_sum(n)
            
        return n == 1
