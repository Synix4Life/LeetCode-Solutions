"""
Runtime: 0ms -> Beats 100% of users with Python
Memory: 19.32MB -> Beats 50.70% of user with Python
"""

class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        set_nums = set(nums)
        threshold = math.floor(len(nums)/2)
        for number in set_nums:
            if nums.count(number) > threshold:
                return number
        return -1
