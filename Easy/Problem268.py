"""
Runtime: 1292ms -> Beats 11.43% of users with Python
Memory: 18.78MB -> Beats 50.69% of user with Python
"""

class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        for i in range(0, len(nums)):
            if i not in nums:
                return i
        return len(nums)
