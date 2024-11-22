"""
Runtime: 31ms -> Beats 14.14% of users with Python
Memory: 16.68MB -> Beats 41.80% of user with Python
"""

class Solution:
    def isPowerOfThree(self, n: int) -> bool:
        if n<0: 
            return False
        for i in range(0,n):
            if pow(3, i) == n:
                return True
            elif pow(3, i) > n:
                return False
        return False