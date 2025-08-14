"""
Runtime: 0ms -> Beats 100% of users with Python
Memory: 17.90MB -> Beats 84.05% of user with Python
"""

class Solution:
    def buildArray(self, nums: List[int]) -> List[int]:
        result : List[int] = []
        for element in nums:
            result.append(nums[element])
        return result
