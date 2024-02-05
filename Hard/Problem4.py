"""
Runtime: 89ms -> Beats 39.14% of users with Python
Memory: 16.92MB -> Beats 58.36% of user with Python
"""

class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        merged = nums1 + nums2
        merged.sort()
        le = len(merged)
        if le == 0:
            return []
        if le % 2 == 0:
            return float(
                (merged[math.floor(le/2-1)] + merged[math.floor(le/2)])/2
            )
        else:
            return float(merged[math.floor(le/2)])
