class Solution:
    def isPalindrome(self, x: int) -> bool:
        num = str(x)
        rev = num[::-1] #using splicing to reverse the number
        if num==rev:
            return "true"
