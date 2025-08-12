"""
Runtime: 51ms -> Beats 7.32% of users with Python
Memory: 26.72MB -> Beats 94.32% of user with Python
"""

class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        nums.sort()
        for i in range(1, len(nums)):
            if nums[i-1] == nums[i]:
                return True
        return False
