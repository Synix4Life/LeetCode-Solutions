"""
Runtime: 0ms -> Beats 100% of users with Python
Memory: 18.08MB -> Beats 8.75% of user with Python
"""

class Solution:
    def isPerfectSquare(self, num: int) -> bool:
        return sqrt(num).is_integer()
