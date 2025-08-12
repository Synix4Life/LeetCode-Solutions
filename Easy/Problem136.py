"""
Runtime: 3793ms -> Beats 7.67% of users with Python
Memory: 19.61MB -> Beats 42.53% of user with Python
"""

class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        for i in range(min(nums), max(nums)+1):
            if nums.count(i) == 1:
                return i
