"""
Runtime: 38ms -> Beats 46.03% of users with Python
Memory: 16.34MB -> Beats 79.13% of user with Python
"""

class Solution:
    def smallestEvenMultiple(self, n: int) -> int:
        if n%2==0:
            return n
        else:
            return 2*n
