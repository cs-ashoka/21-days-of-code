"""
Contains Duplicate
"""


class Solution(object):
    def containsDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        set_num = sorted(list(set(nums)))
        nums = sorted(nums)
        return (set_num != nums)
