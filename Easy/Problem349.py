"""
Runtime: 11ms -> Beats 14.19% of users with Python
Memory: 18.05MB -> Beats 24.01% of user with Python
"""

class Solution:
    def intersection(self, nums1: List[int], nums2: List[int]) -> List[int]:
        result = []
        for number in nums1:
            if number in nums2 and not number in result:
                result.append(number)
        return result
