"""
Runtime: 15ms -> Beats 49.63% of users with Python
Memory: 19.17MB -> Beats 54.80% of user with Python
"""

from collections import Counter

class Solution:
    def findErrorNums(self, nums: List[int]) -> List[int]:
        counts = Counter(nums)
        twice, none = [], []
        for i in range(1, len(nums) + 1):
            if counts[i] == 2:
                twice.append(i)
            elif counts[i] == 0:
                none.append(i)
        return twice + none
