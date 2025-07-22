"""
Runtime: 11ms -> Beats 17.11% of users with Python
Memory: 17.68MB -> Beats 99.39% of user with Python
"""

class Solution:
    def intersect(self, nums1: List[int], nums2: List[int]) -> List[int]:
        result = []
        for number in nums1:
            if number in nums2:
                result.append(number)
                nums2.remove(number)
        return result
