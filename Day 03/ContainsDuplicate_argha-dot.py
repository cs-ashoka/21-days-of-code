class Solution:
    def containsDuplicate(self, nums: list[int]) -> bool:
        count_arr = set()

        for num in nums:
            if num in count_arr:
                return True

            count_arr.add(num)

        return False