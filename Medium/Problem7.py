"""
Runtime: 41ms -> Beats 38.38% of users with Python
Memory: 16.52MB -> Beats 68.10% of user with Python
"""

class Solution:
    def reverse(self, x: int) -> int:
        if x < 0:
            result = -int(str(x*(-1))[::-1])
            return 0 if (result < -2 ** 31) else result
        else:
            result = int(str(x)[::-1])
            return 0 if (result >= 2 ** 31) else result
