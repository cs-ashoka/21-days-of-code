class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        for first_index in range(0, len(nums)):
            for second_index in range(first_index, len(nums)):
                if nums[first_index] + nums[second_index] == target:
                    return first_index, second_index
        return None, None
      