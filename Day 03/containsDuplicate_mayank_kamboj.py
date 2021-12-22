class Solution:
    def containsDuplicate(self, nums: list) -> bool:
        memory = {}
        for i in nums : 
            if i in memory : return True
            memory[i] = True
        return False